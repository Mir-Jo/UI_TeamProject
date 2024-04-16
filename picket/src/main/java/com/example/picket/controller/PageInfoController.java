package com.example.picket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageInfoController {
    /*concert_info*/

    /*musical_info*/
@GetMapping("/musical_paris.info")
public String gotoMyPage() { return "/category/Musical/paris";}
    /*act_info*/

    /*classic_info*/

    /*exhibit_info*/
}
