package com.example.picket.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Slf4j
@Controller
public class PageInfoController {
    /*concert_info*/
    @GetMapping("/season")
    public String gotoseason(){return "/categories/Concert/season";}
    @GetMapping("/beautiful")
    public String gotobeautiful(){return "/categories/Concert/beautiful";}
    @GetMapping("/lovesome")
    public String gotolovesome(){return "/categories/Concert/lovesome";}
    @GetMapping("/boys")
    public String gotoboys(){return "/categories/Concert/boys";}
    @GetMapping("/daysix")
    public String gotodaysix(){return "/categories/Concert/daysix";}
    @GetMapping("/king")
    public String gotoking(){return "/categories/Concert/king";}
    @GetMapping("/glow")
    public String gotoglow(){return "/categories/Concert/glow";}
    @GetMapping("/hipho")
    public String gotoworldtour(){return "/categories/Concert/hipho";}




    /*musical_info*/

@GetMapping("/musical_paris.info")
public String paris() { return "/categories/Musical/paris";}

@GetMapping("/musical_touching.info")
public String touching() { return "/categories/Musical/touching";}

@GetMapping("/musical_dia.info")
public String dia() { return "/categories/Musical/디아길레프";}

@GetMapping("/musical_dear.info")
public String dear() { return "/categories/Musical/dear";}

@GetMapping("/musical_bear.info")
public String bear() { return "/categories/Musical/bear";}

@GetMapping("/musical_next.info")
public String next() { return "/categories/Musical/next";}

@GetMapping("/musical_here.info")
public String here() { return "/categories/Musical/here";}

@GetMapping("/musical_violin.info")
public String violin() { return "/categories/Musical/violin";}



    /*act_info*/
    @GetMapping("/musicalTheaterCarolInfo")
    public String musicalTheaterCarol(){
        return "/categories/Act/musicalTheaterCarol";
    }

    @GetMapping("/theaterCloserInfo")
    public String theaterCloser(){
        return "/categories/Act/theaterCloser";
    }

    @GetMapping("/theaterHangOverInfo")
    public String theaterHangOver(){
        return "/categories/Act/theaterHangOver";
    }

    @GetMapping("/theaterHerzKlangInfo")
    public String theaterHerzKlang(){
        return "/categories/Act/theaterHerzKlang";
    }

    @GetMapping("/theaterHeungSinSoInfo")
    public String theaterHeungSinSo(){
        return "/categories/Act/theaterHeungSinSo";
    }

    @GetMapping("/theaterInHellInfo")
    public String theaterInHell(){
        return "/categories/Act/theaterInHell";
    }

    @GetMapping("/theaterPSpartnerInfo")
    public String theaterPSpartner(){
        return "/categories/Act/theaterPSpartner";
    }

    @GetMapping("/theaterRainbowInfo")
    public String theaterRainbow(){
        return "/categories/Act/theaterRainbow";
    }

    /*classic_info*/

    /* 라 트라비아타 이동 */
    @GetMapping("/LaTraviata")
    public String gotoLaTraviata() {
        return "/categories/Classic/LaTraviata";
    }

    /* 막심 벤게로프 이동 */
    @GetMapping("/Maxim")
    public String gotoMaxim() {
        return "/categories/Classic/Maxim";
    }

    /* 백조의 호수 이동 */
    @GetMapping("/Swan")
    public String gotoSwan() {
        return "/categories/Classic/Swan";
    }

    /* 존 윌리엄스 이동 */
    @GetMapping("/JohnWilliams")
    public String gotoJohnWilliams() {
        return "/categories/Classic/JohnWilliams";
    }

    /* 한여름밤의 꿈 이동 */
    @GetMapping("/MidsummerNight")
    public String gotoMidsummerNight() {
        return "/categories/Classic/MidsummerNight";
    }

    /* 드뷔시 이동 */
    @GetMapping("/Debussy")
    public String gotoDebussy() {
        return "/categories/Classic/Debussy";
    }

    /* 지브리 이동 */
    @GetMapping("/GhiBli")
    public String gotoGhiBli() {
        return "/categories/Classic/GhiBli";
    }

    /*띵훈좌 이동 */
    @GetMapping("/Jung")
    public String gotoJung() {
        return "/categories/Classic/Jung";
    }

    /* 해리포터 이동 */
    @GetMapping("/Harry")
    public String gotoHarry() {
        return "/categories/Classic/Harry";
    }
    /* 상단 일무 이동*/
    @GetMapping("/OneMu")
    public String gotoOneMu() {
        return "/categories/Classic/OneMu";
    }
    /* 상단 유키 이동 */
    @GetMapping("/Yuki")
    public String gotoYuki() {
        return "/categories/Classic/Yuki";
    }

    /*exhibit_info*/
    @GetMapping("/banksy")
    public String getbanksy(){
        return "/categories/Exhibit/banksy";}
    @GetMapping("/ghibli")
    public String getghibli(){
        return "/categories/Exhibit/ghibli";}
    @GetMapping("/graffiti")
    public String getgraffiti(){
        return "/categories/Exhibit/graffiti";}
    @GetMapping("/india")
    public String getindia(){
        return "/categories/Exhibit/india";}
    @GetMapping("/osaka")
    public String getosaka(){
        return "/categories/Exhibit/osaka";}
    @GetMapping("/seoul")
    public String getseoul(){
        return "/categories/Exhibit/seoul";}
    @GetMapping("/todusk")
    public String gettodusk(){
        return "/categories/Exhibit/todusk";}
    @GetMapping("/unity")
    public String getunity(){
        return "/categories/Exhibit/unity";}
}
