package com.example.picket.controller;

import com.example.picket.entity.Customer;
import com.example.picket.repository.CustomerRepository;
import com.example.picket.service.CustomerService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Slf4j
@Controller
@RequiredArgsConstructor
public class CustomerViewController{
    private final CustomerRepository customerRepository;
    private final CustomerService customerService;


    @GetMapping("/loginpage")
    public String loginpage(HttpSession session, Model model){
        String errorMessage = (String) session.getAttribute("errorMessage");
        if(errorMessage != null){
            log.info("로그인 실패: 아이디, 비밀번호 불일치");
            model.addAttribute("errorMessage", errorMessage);
            session.removeAttribute("errorMessage");
        }
        return "/login/login";
    }
    @PostMapping("/login")
    public String login(String id, String password, HttpSession session, HttpServletRequest request, RedirectAttributes rttr){
        if(customerService.authentication(id, password)){
            Customer customer = customerRepository.findById(id).orElse(null);

            if(customer!=null){
                session.setAttribute("id", customer);
                log.info("현재 세션id: "+session.getAttribute(customer.getId().toString()));

                log.info("로그인 성공");
                rttr.addFlashAttribute("message", customer.getName()+"님 환영합니다.");
                return "redirect:/loginmain";
            } else{
                rttr.addFlashAttribute("message", "잘못된 ID 혹은 비밀번호입니다. 다시 입력해주세요.");
                return "redirect:/loginpage";
            }
        }
        else{
            rttr.addFlashAttribute("message", "잘못된 ID 혹은 비밀번호입니다. 다시 입력해주세요.");
            return "redirect:/loginpage";
        }
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request, HttpServletResponse response, HttpSession session, RedirectAttributes rttr){
        new SecurityContextLogoutHandler().logout(request, response, SecurityContextHolder.getContext().getAuthentication());
        log.info("request: "+request+", response: "+response+", authentication: "+SecurityContextHolder.getContext().getAuthentication());
        session.invalidate();
        log.info("세션 무력화 완료");
        rttr.addFlashAttribute("message", "로그아웃되었습니다.");
        return "redirect:/main";
    }
}
