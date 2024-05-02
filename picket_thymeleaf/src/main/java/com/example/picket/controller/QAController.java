package com.example.picket.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Controller
public class QAController {
    /* 내 문의내역으로 이동 */
    @GetMapping("/QAList")
    public String gotoQAList() { return "/mypage/QA_list";}
    /* 1:1문의 등록으로 이동 */
    @GetMapping("/QAWrite")
    public String qaWrite(){ return "/support/QA_Write"; }
    @PostMapping("/newQA")
    public String newQA(){

        return "redirect:/mypage/QA_list";
    }

    @GetMapping("/QaAnswer")
    public String gotoQaAnswer() { return "/mypage/QaAnswer";}

}
