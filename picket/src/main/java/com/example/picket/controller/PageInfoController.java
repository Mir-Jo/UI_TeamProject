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

    /* 백조의 호수 이동 */
    @GetMapping("/Swan")
    public String gotoSwan() {
        return "/category/Classic/Swan";
    }

    /* 존 윌리엄스 이동 */
    @GetMapping("/JohnWilliams")
    public String gotoJohnWilliams() {
        return "/category/Classic/JohnWilliams";
    }

    /* 한여름밤의 꿈 이동 */
    @GetMapping("/MidsummerNight")
    public String gotoMidsummerNight() {
        return "/category/Classic/MidsummerNight";
    }

    /* 드뷔시 이동 */
    @GetMapping("/Debussy")
    public String gotoDebussy() {
        return "/category/Classic/Debussy";
    }

    /* 지브리 이동 */
    @GetMapping("/GhiBli")
    public String gotoGhiBli() {
        return "/category/Classic/GhiBli";
    }

    /*띵훈좌 이동 */
    @GetMapping("/Jung")
    public String gotoJung() {
        return "/category/Classic/Jung";
    }

    /* 해리포터 이동 */
    @GetMapping("/Harry")
    public String gotoHarry() {
        return "/category/Classic/Harry";
    }
    /* 상단 일무 이동*/
    @GetMapping("/OneMu")
    public String gotoOneMu() {
        return "/category/Classic/OneMu";
    }
    /* 상단 유키 이동 */
    @GetMapping("/Yuki")
    public String gotoYuki() {
        return "/category/Classic/Yuki";
    }

    /*exhibit_info*/
}
