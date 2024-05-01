package com.example.picket.controller;

import com.example.picket.dto.PerformanceForm;
import com.example.picket.entity.Performance;
import com.example.picket.repository.PerformanceRepository;
import com.example.picket.service.PerformanceService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
@RequiredArgsConstructor
public class PageInfoController {
    /*concert_info*/
    @GetMapping("/concert/season")
    public String gotoseason(){return "/categories/Concert/season";}
    @GetMapping("/concert/beautiful")
    public String gotobeautiful(){return "/categories/Concert/beautiful";}
    @GetMapping("/concert/lovesome")
    public String gotolovesome(){return "/categories/Concert/lovesome";}
    @GetMapping("/concert/boys")
    public String gotoboys(){return "/categories/Concert/boys";}
    @GetMapping("/concert/daysix")
    public String gotodaysix(){return "/categories/Concert/daysix";}
    @GetMapping("/concert/king")
    public String gotoking(){return "/categories/Concert/king";}
    @GetMapping("/concert/glow")
    public String gotoglow(){return "/categories/Concert/glow";}
    @GetMapping("/concert/hipho")
    public String gotoworldtour(){return "/categories/Concert/hipho";}




    /*musical_info*/

@GetMapping("/musical/musical_paris.info")
public String paris() { return "/categories/Musical/paris";}

@GetMapping("/musical/musical_touching.info")
public String touching() { return "/categories/Musical/touching";}

@GetMapping("/musical/musical_dia.info")
public String dia() { return "/categories/Musical/디아길레프";}

@GetMapping("/musical/musical_dear.info")
public String dear() { return "/categories/Musical/dear";}

@GetMapping("/musical/musical_bear.info")
public String bear() { return "/categories/Musical/bear";}

@GetMapping("/musical/musical_next.info")
public String next() { return "/categories/Musical/next";}

@GetMapping("/musical/musical_here.info")
public String here() { return "/categories/Musical/here";}

@GetMapping("/musical/musical_violin.info")
public String violin() { return "/categories/Musical/violin";}


    private final PerformanceService performanceService;
    private final PerformanceRepository performanceRepository;

    /*act_info*/
    @GetMapping("/act/musicalTheaterCarolInfo")
    public String musicalTheaterCarol(Model model){
        PerformanceForm performanceForm = performanceService.findInfo("음악극 〈캐롤〉");

        System.out.println("확인: " + performanceForm);

        model.addAttribute("title", performanceForm.getTitle());
        model.addAttribute("place", performanceForm.getPlace());
        model.addAttribute("dates", performanceForm.getDates());
        model.addAttribute("category", performanceForm.getCategory());
        model.addAttribute("price", performanceForm.getPrice());


        return "/categories/Act/musicalTheaterCarol";
    }

    @GetMapping("/act/theaterCloserInfo")
    public String theaterCloser(){
        return "/categories/Act/theaterCloser";
    }

    @GetMapping("/act/theaterHangOverInfo")
    public String theaterHangOver(){
        return "/categories/Act/theaterHangOver";
    }

    @GetMapping("/act/theaterHerzKlangInfo")
    public String theaterHerzKlang(){
        return "/categories/Act/theaterHerzKlang";
    }

    @GetMapping("/act/theaterHeungSinSoInfo")
    public String theaterHeungSinSo(){
        return "/categories/Act/theaterHeungSinSo";
    }

    @GetMapping("/act/theaterInHellInfo")
    public String theaterInHell(){
        return "/categories/Act/theaterInHell";
    }

    @GetMapping("/act/theaterPSpartnerInfo")
    public String theaterPSpartner(){
        return "/categories/Act/theaterPSpartner";
    }

    @GetMapping("/act/theaterRainbowInfo")
    public String theaterRainbow(){
        return "/categories/Act/theaterRainbow";
    }

    /*classic_info*/

    /* 라 트라비아타 이동 */
    @GetMapping("/classic/LaTraviata")
    public String gotoLaTraviata() {
        return "/categories/Classic/LaTraviata";
    }

    /* 막심 벤게로프 이동 */
    @GetMapping("/classic/Maxim")
    public String gotoMaxim() {
        return "/categories/Classic/Maxim";
    }

    /* 백조의 호수 이동 */
    @GetMapping("/classic/Swan")
    public String gotoSwan() {
        return "/categories/Classic/Swan";
    }

    /* 존 윌리엄스 이동 */
    @GetMapping("/classic/JohnWilliams")
    public String gotoJohnWilliams() {
        return "/categories/Classic/JohnWilliams";
    }

    /* 한여름밤의 꿈 이동 */
    @GetMapping("/classic/MidsummerNight")
    public String gotoMidsummerNight() {
        return "/categories/Classic/MidsummerNight";
    }

    /* 드뷔시 이동 */
    @GetMapping("/classic/Debussy")
    public String gotoDebussy() {
        return "/categories/Classic/Debussy";
    }

    /* 지브리 이동 */
    @GetMapping("/classic/GhiBli")
    public String gotoGhiBli() {
        return "/categories/Classic/GhiBli";
    }

    /*띵훈좌 이동 */
    @GetMapping("/classic/Jung")
    public String gotoJung() {
        return "/categories/Classic/Jung";
    }

    /* 해리포터 이동 */
    @GetMapping("/classic/Harry")
    public String gotoHarry() {
        return "/categories/Classic/Harry";
    }
    /* 상단 일무 이동*/
    @GetMapping("/classic/OneMu")
    public String gotoOneMu() {
        return "/categories/Classic/OneMu";
    }
    /* 상단 유키 이동 */
    @GetMapping("/classic/Yuki")
    public String gotoYuki() {
        return "/categories/Classic/Yuki";
    }

    /*exhibit_info*/
    @GetMapping("/exhibit/banksy")
    public String getbanksy(){
        return "/categories/Exhibit/banksy";}
    @GetMapping("/exhibit/ghibli")
    public String getghibli(){
        return "/categories/Exhibit/ghibli";}
    @GetMapping("/exhibit/graffiti")
    public String getgraffiti(){
        return "/categories/Exhibit/graffiti";}
    @GetMapping("/exhibit/india")
    public String getindia(){
        return "/categories/Exhibit/india";}
    @GetMapping("/exhibit/osaka")
    public String getosaka(){
        return "/categories/Exhibit/osaka";}
    @GetMapping("/exhibit/seoul")
    public String getseoul(){
        return "/categories/Exhibit/seoul";}
    @GetMapping("/exhibit/todusk")
    public String gettodusk(){
        return "/categories/Exhibit/todusk";}
    @GetMapping("/exhibit/unity")
    public String getunity(){
        return "/categories/Exhibit/unity";}
}
