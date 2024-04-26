package com.example.picket.controller;

import com.example.picket.dto.AddCustomerRequest;
import com.example.picket.repository.CustomerRepository;
import com.example.picket.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@RequiredArgsConstructor
@Controller
public class CustomerApiController {

    @Autowired
    private final CustomerRepository customerRepository;
    private final CustomerService customerService;

    /* 회원가입 */
    @PostMapping("/signup")
    public String signup(AddCustomerRequest request, RedirectAttributes rttr){
        if(customerRepository.findById(request.getId()).orElse(null) != null){
            rttr.addFlashAttribute("errorMessage", "이미 사용중인 id입니다!");
            return "redirect:/loginpage";
        }
        else if(request.getId().length() > 20 || request.getId().trim().equals("")){
            rttr.addFlashAttribute("errorMessage", "유효하지 않은 아이디입니다!");
            return "redirect:/loginpage";
        }
        else if(customerRepository.findByTel(request.getTel()).orElse(null) != null){
            rttr.addFlashAttribute("errorMessage", "이미 사용중인 전화번호입니다!");
            return "redirect:/loginpage";
        }
        else if(request.getName().trim().length() > 20 || request.getName().trim().equals("")){
            rttr.addFlashAttribute("errorMessage", "유효하지 않은 이름입니다!");
            return "redirect:/loginpage";
        }
        customerService.save(request);
        rttr.addFlashAttribute("successMessage", "가입이 완료되었습니다.");
        return "redirect:/loginpage";
    }
}
