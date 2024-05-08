package com.example.picket.controller;

import com.example.picket.dto.AddCustomerRequest;
import com.example.picket.entity.Customer;
import com.example.picket.repository.CustomerRepository;
import com.example.picket.service.CustomerService;
import com.example.picket.service.ProfileService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
@Controller
public class ProfileController {
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerService customerService;
    @Autowired
    private ProfileService profileService;

    /* 마이페이지*/
    @GetMapping("/mypagemain")
    public String gotoMyPage() { return "/mypage/mypagemain"; }
    /* 찜목록 */
    @GetMapping("/wishlist")
    public String gotowishlist() { return "/mypage/wishlist";}
    /* 포인트 내역 */
    @GetMapping("/pointlist")
    public String gotopointlist() { return "/mypage/pointlist";}
    /* 회원정보 */
    @GetMapping("/profile")
    public String gotoProfile() { return "/mypage/profile";}
    /* 회원정보 수정 */
    @PostMapping("/EditPasswordCheck")
    public String editPwCheck(String editPasswordCheck, HttpSession session, RedirectAttributes rttr) {
        if(profileService.passwordCheck(editPasswordCheck, session)){
            Customer customer = (Customer) session.getAttribute("customer");
         return "redirect:/profileEdit";
        }
        rttr.addFlashAttribute("passwordCheckError", "비밀번호가 일치하지 않습니다.");
        return "redirect:/profile";
    }
    @GetMapping("/profileEdit")
    public String gotoProfileEdit() { return "/mypage/profileEdit";}

    @PostMapping("/EditedProfile")
    public String updateProfile(AddCustomerRequest request, HttpSession session, RedirectAttributes rttr){
        Customer currentUser = (Customer) session.getAttribute("customer");
        String currentId = currentUser.getId();
        log.info("현재 유저ID:"+currentId);

        if(customerRepository.findByTel(request.getTel()).isEmpty() || request.getTel().equals(currentUser.getTel())){
            customerService.edit(request, currentId);
            session.invalidate();
            rttr.addFlashAttribute("Success","회원정보가 변경되었습니다. 다시 로그인해주세요.");
            return "redirect:/main";
        } else{
        rttr.addFlashAttribute("Error","이미 사용중인 전화번호입니다. 다시 입력해주세요.");
        return "redirect:/profileEdit";
        }
    }

    /* 회원탈퇴 */
    @GetMapping("/withdrawal")
    public String gotoWithdrawal() { return "/mypage/withdrawal";}

    @PostMapping("/DeletePasswordCheck")
    public String deletePwCheck(String deletePasswordCheck, HttpSession session, RedirectAttributes rttr) {
        if(profileService.passwordCheck(deletePasswordCheck, session)){
            return "redirect:/withdrawal";
        }
        rttr.addFlashAttribute("passwordCheckError", "비밀번호가 일치하지 않습니다.");
        return "redirect:/profile";
    }

    @PostMapping("/profile/delete")
    public String deleteProfile(HttpSession session, RedirectAttributes rttr){
        Customer currentUser = (Customer) session.getAttribute("customer");
        if(currentUser != null){
            customerRepository.delete(currentUser);
            session.invalidate();
            rttr.addFlashAttribute("Success", "계정이 삭제되었습니다. 이용해주셔서 감사합니다.");
            return "redirect:/main";
        }
        rttr.addFlashAttribute("Error", "세션이 만료되었습니다. 다시 로그인한 뒤에 진행해주세요.");
        return "redirect:/main";
    }
}
