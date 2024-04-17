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



    /*musical_info*/
@GetMapping("/musical_paris.info")
public String gotoMyPage() { return "/category/Musical/paris";}


    /*act_info*/
    @GetMapping("/musicalTheaterCarolInfo")
    public String musicalTheaterCarol(){
        return "/category/Act/musicalTheaterCarol";
    }

    @GetMapping("/theaterCloserInfo")
    public String theaterCloser(){
        return "/category/Act/theaterCloser";
    }

    @GetMapping("/theaterHangOverInfo")
    public String theaterHangOver(){
        return "/category/Act/theaterHangOver";
    }

    @GetMapping("/theaterHerzKlangInfo")
    public String theaterHerzKlang(){
        return "/category/Act/theaterHerzKlang";
    }

    @GetMapping("/theaterHeungSinSoInfo")
    public String theaterHeungSinSo(){
        return "/category/Act/theaterHeungSinSo";
    }

    @GetMapping("/theaterInHellInfo")
    public String theaterInHell(){
        return "/category/Act/theaterInHell";
    }

    @GetMapping("/theaterPSpartnerInfo")
    public String theaterPSpartner(){
        return "/category/Act/theaterPSpartner";
    }

    @GetMapping("/theaterRainbowInfo")
    public String theaterRainbow(){
        return "/category/Act/theaterRainbow";
    }

    /*classic_info*/

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

    /*exhibit_info*/
}
