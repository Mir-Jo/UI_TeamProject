package com.example.picket.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Slf4j
@Controller
public class PageInfoController {
    /*concert_info*/

    /* 라 트라비아타 이동 */
    @GetMapping("/LaTraviata")
    public String gotoLaTraviata() {
        return "/category/Classic/LaTraviata";
    }

    /* 막심 벤게로프 이동 */
    @GetMapping("/Maxim")
    public String gotoMaxim() {
        return "/category/Classic/Maxim";
    }



    /*musical_info*/

    /*act_info*/

    /*classic_info*/

    /*exhibit_info*/
}
