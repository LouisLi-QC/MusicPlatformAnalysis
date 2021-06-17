package com.hwadee.scu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RouterController {
    @RequestMapping("/EnterToHome")
    public String EnterToHome(String userName, String password) {
        System.out.println(userName);
        System.out.println(password);
        return "1";
    }

    @RequestMapping("/EnterToAdmin")
    public String EnterToAdmin(){
        return "admin";
    }
    @RequestMapping("/EnterToAdminVisualization")
    public String EnterToAdminV(){
        return "adminTest";
    }
    @RequestMapping("/EnterToRegister")
    public String EnterToRegister() {
        return "register";
    }

//    @RequestMapping("/")
//    public String homePage(){
//        return "index";
//    }

    @RequestMapping("/EnterToLogin")
    public String EnterToLogin() {
        return "login";
    }

    @RequestMapping("/EnterToShow")
    public String EnterToShow(){ return "test";}

    @RequestMapping("/EnterToAreaMap")
    public String EnterToAreaMap(){ return "areaMap";}

    @RequestMapping("/EnterToCommentChart")
    public String EnterToCommentChart(){ return "commentChart";}

    @RequestMapping("/EnterToSongAndSinger")
    public String EnterToSongAndSinger(){ return "songAndsinger";}

    @RequestMapping("/EnterToUserInfo")
    public String EnterToUserInfo(){ return "userInformation";}

    @RequestMapping("/EnterToPlayList")
    public String EnterToPlayList(){ return "playList";}

    @RequestMapping("/EnterToWordCloud")
    public String EnterToWordCloud(){ return "wordCloud";}

    @RequestMapping("/EnterToSingerComment")
    public String EnterToSingerComment(){return "singerComment";}

}

