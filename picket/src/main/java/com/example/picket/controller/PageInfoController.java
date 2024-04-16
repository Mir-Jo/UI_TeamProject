package com.example.picket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageInfoController {
    /*concert_info*/

    /*musical_info*/

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

    /*exhibit_info*/
}
