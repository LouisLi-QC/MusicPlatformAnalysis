package com.hwadee.scu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@Controller
public class RouterController {
    @RequestMapping("/EnterToShow")
    public String EnterToShow(){
        return "chart1";
    }
    @RequestMapping("/EnterToDashBoardv2")
    public String EnterToWelcome(){
        return "calendar";
    }
    @RequestMapping("/EnterToTalentQuery")
    public String EnterToTalentQuery(HttpServletRequest request){
        return "TalentQuery";
    }
    @RequestMapping("/EnterToTalentCompare")
    public String EnterToTalentCompare(){
        return "TalentCompare";
    }
    @RequestMapping("/EnterToQueryStaff")
    public String EnterToQueryStaff(HttpServletRequest request){
        return "QueryStaff";
    }
    @RequestMapping("/EnterToAuditStaff")
    public String EnterToAuditStaff(){
        return  "AuditStaff";
    }

    @RequestMapping("/EnterToAddEvaluation")
    public String EnterToAddEvaluation(){
        return "AddEvaluation";
    }

    @RequestMapping("/EnterToCompanyInformation")
    public String EnterToCompanyInformation(){
        return "CompanyInformationOperation";
    }
    @RequestMapping("/EnterToCompanyCertification")
    public String EnterToCompanyCertification(){
        return "CompanyCertification";
    }
    @RequestMapping("/EnterToMission")
    public String EnterToMission(){
        return "Mission";
    }

}
