package com.example.picket.controller;

import com.example.picket.dto.QAForm;
import com.example.picket.entity.Customer;
import com.example.picket.entity.QA;
import com.example.picket.service.QAService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Controller
public class QAController {


    private final QAService qaService;

    /* 내 문의내역으로 이동 */
    @GetMapping("/QAList")
    public String gotoQAList(Model model, HttpSession session) {
        List<QA> qaList = qaService.getAllQA(session);
        model.addAttribute("qaList", qaList);
        return "/mypage/QA_list";
    }


    /* 1:1문의 등록으로 이동 */
    @GetMapping("/QAWrite")
    public String qaWrite(){ return "/support/QA_Write"; }
    @PostMapping("/newQA")
    public String newQA(QAForm dto, HttpSession session, RedirectAttributes rttr){
        qaService.save(dto, session);
        if(dto != null && session.getAttribute("customer") !=null ){
            Customer customer = (Customer)session.getAttribute("customer");
            log.info("현재 고객명: "+customer.getName());
            log.info("문의 제목: "+dto.getQa_title()+", 문의 유형:"+dto.getCategory()+ ", 문의 상태:"+dto.getState()+", 문의 시간"+dto.getWrite_date());
            rttr.addFlashAttribute("message", "문의가 성공적으로 등록되었습니다.");
            return "redirect:/QAList";
        } else {
            rttr.addFlashAttribute("Error", "세션이 만료되었습니다. 다시 로그인해주세요.");
            return "redirect:/main";
        }
    }

    @GetMapping("/QaAnswer")
    public String gotoQaAnswer() { return "/mypage/QaAnswer";}

}
