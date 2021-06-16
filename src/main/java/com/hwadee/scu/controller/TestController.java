package com.hwadee.scu.controller;


import com.hwadee.scu.service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
public class TestController {
    @Autowired
    CommentsService commentsService;
    @RequestMapping("/EnterToCheckInfo")
    public int EnterToCheckInfo(String userName, String password, String confirmPassword, String phoneNumber){
        System.out.println(userName);
        System.out.println(password);
        System.out.println(confirmPassword);
        System.out.println(phoneNumber);
        return 1;
    }
//    @RequestMapping("/hour")
//    public int[] test(){
//        int[] res=commentsService.getCommentsByHour();
//        return res;
//    }
}
