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

    @RequestMapping("/EnterToForgotPassword")
    public String EnterToForgotPassword() {
        return "examples/forgot-password";
    }

    @RequestMapping("/EnterToRecoverPassword")
    public String EnterToRecoverPassword() {
        return "examples/recover-password";
    }

    @RequestMapping("/EnterToShow")
    public String EnterToShow(){ return "songAndsinger";}

    @RequestMapping("/EnterToAreaMap")
    public String EnterToAreaMap(){ return "areaMap";}

    @RequestMapping("/EnterToCommentChart")
    public String EnterToCommentChart(){ return "commentChart";}

    @RequestMapping("/EnterToSongAndSinger")
    public String EnterToSongAndSinger(){ return "songAndsinger";}

    @RequestMapping("/EnterToUserInfo")
    public String EnterToUserInfo(){ return "userInformation";}

    @RequestMapping("/EnterToAddEvaluation")
    public String EnterToAddEvaluation() {
        return "AddEvaluation";
    }

    @RequestMapping("/EnterToCompanyInformation")
    public String EnterToCompanyInformation() {
        return "CompanyInformationOperation";
    }

    @RequestMapping("/EnterToCompanyCertification")
    public String EnterToCompanyCertification() {
        return "CompanyCertification";
    }

    @RequestMapping("/EnterToMission")
    public String EnterToMission() {
        return "Mission";
    }

}

