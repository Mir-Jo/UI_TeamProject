package com.example.picket.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Slf4j
@Controller
public class PageInfoController {
    /*concert_info*/
    @GetMapping("season")
    public String gotoseason(){return "/category/Concert/season";}
    @GetMapping("/beautiful")
    public String gotobeautiful(){return "/category/Concert/beautiful";}
    @GetMapping("/bobby")
    public String gotobobby(){return "/category/Concert/bobby";}
    @GetMapping("/boys")
    public String gotoboys(){return "/category/Concert/boys";}
    @GetMapping("/daysix")
    public String gotodaysix(){return "/category/Concert/daysix";}
    @GetMapping("/king")
    public String gotoking(){return "/category/Concert/king";}
    @GetMapping("/glow")
    public String gotoglow(){return "/category/Concert/glow";}
    @GetMapping("/worldtour")
    public String gotoworldtour(){return "/category/Concert/worldtour";}

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
