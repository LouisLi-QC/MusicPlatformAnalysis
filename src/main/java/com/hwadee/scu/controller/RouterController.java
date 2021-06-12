package com.hwadee.scu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@Controller
public class RouterController {
    @RequestMapping("/EnterToHome")
    public String EnterToHome(String userName, String password) {
        System.out.println(userName);
        return "../public/index";
    }

    @RequestMapping("/EnterToRegister")
    public String EnterToRegister() {
        return "register";
    }

    @RequestMapping("/EnterToCheckInfo")
    public String EnterToCheckInfo(String userName, String password, String confirmPassword, String phoneNumber) {
        System.out.println(userName);
        System.out.println(password);
        System.out.println(confirmPassword);
        System.out.println(phoneNumber);
        return "login";
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
