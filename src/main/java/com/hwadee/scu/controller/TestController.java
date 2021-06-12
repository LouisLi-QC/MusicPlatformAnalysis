package com.hwadee.scu.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/EnterToCheckInfo")
    public int EnterToCheckInfo(String userName, String password, String confirmPassword, String phoneNumber){
        System.out.println(userName);
        System.out.println(password);
        System.out.println(confirmPassword);
        System.out.println(phoneNumber);
        return 1;
    }
}
