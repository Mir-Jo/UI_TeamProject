package com.example.picket.controller;

import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Slf4j
@Controller
public class PicketMainController {
    //===================================================================
    /* 링크 이동 컨테이너 */

    /* 메인으로 이동 */
    @GetMapping("/main")
    public String gotoMain() {
        return "main";
    }

    /* 로그인상태인 메인으로 이동 */
    @GetMapping("/loginmain")
    public String gotologinMain(){
        return "loginmain";
    }

    /* 고객센터로 이동 */
    @GetMapping("/support")
    public String supportMain() { return "/support/support";}

    /* 마이페이지로 이동 */
    @GetMapping("/mypagemain")
    public String gotoMyPage() { return "/mypage/mypagemain";}
    @GetMapping("/wishlist")
    public String gotowishlist() { return "/mypage/wishlist";}
    @GetMapping("/pointlist")
    public String gotopointlist() { return "/mypage/pointlist";}
    @GetMapping("/profile")
    public String gotoProfile() { return "/mypage/profile";}

    /* 내 문의내역으로 이동 */
    @GetMapping("/QAList")
    public String gotoQAList() { return "/mypage/QA_list";}

    @GetMapping("/FindIDPW")
    public String findIDPW(){ return "/login/FindIDPW"; }

    /* 카테고리별 작품목록으로 이동 */
    @GetMapping("/categories/concertlist")
    public String concertList() {return "/categories/ConcertList";}
    @GetMapping("/categories/musicallist")
    public String musicalList() {return "/categories/MusicalList";}
    @GetMapping("/categories/actlist")
    public String actList() {return "/categories/ActList";}
    @GetMapping("/categories/classiclist")
    public String classicList() {return "/categories/ClassicList";}
    @GetMapping("/categories/exhibitlist")
    public String exhibitList() {return "/categories/ExhibitList";}

    /* 1:1문의 등록으로 이동 */
    @GetMapping("/QAWrite")
    public String qaWrite(){ return "/support/QA_Write"; }
}
