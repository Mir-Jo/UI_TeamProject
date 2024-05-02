package com.example.picket.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WishListController {
    @PostMapping("/wishEnroll")
    public void wishEnroll(HttpServletRequest request){

        HttpSession session = request.getSession();


        System.out.println("확인:" + session.getAttribute("cId"));
    }
}
