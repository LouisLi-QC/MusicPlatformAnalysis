package com.hwadee.scu.controller;

import com.hwadee.scu.common.util.Email;
import com.hwadee.scu.common.util.Response;
import com.hwadee.scu.common.util.StringRedisUtils;
import com.hwadee.scu.service.EmailService;
import com.sun.org.glassfish.external.statistics.annotations.Reset;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * create by: fanyang
 * description: 前端登陆的controller
 * create time:
 */
@RestController
@CrossOrigin
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private StringRedisUtils stringRedisUtils;
    @Autowired
    static JavaMailSender javaMailSender;
    @Autowired
    EmailService emailService;
    /**
     * create by: fanyang
     * description:
     * params:phoneNumber为用户手机号，code为系统生成的验证码
     * return:返回true代表发送成功,false代表发送失败
     * create time:
     */
    @RequestMapping("/sendCode")
    public Response sendCode(String Email,String code){
        System.out.println(Email);
        System.out.println(code);
       // boolean flag=stringRedisUtils.expire(Email,code,300);//将验证码写入redis
//        Email email=new Email();
//        email.sendEmail("fy1763089574@qq.com");//发送验证码
        // 构建一个邮件对象
//        SimpleMailMessage message = new SimpleMailMessage();
//        // 设置邮件主题
//        message.setSubject("这是一封测试邮件");
//        // 设置邮件发送者，这个跟application.yml中设置的要一致
//        message.setFrom("1763089574@qq.com");
//        // 设置邮件接收者，可以有多个接收者，中间用逗号隔开，以下类似
//        // message.setTo("10*****16@qq.com","12****32*qq.com");
//        message.setTo(Email);
//
//        // 设置邮件发送日期
//        message.setSentDate(new Date());
//        // 设置邮件的正文
//        message.setText("这是测试邮件的正文");
//        // 发送邮件
//        javaMailSender.send(message);
        boolean flag=emailService.sendEmail(Email);


        if(flag){
            return new Response(true,"验证码发送成功");
        }
        return new Response(false,"验证码发送失败");
    }

    @RequestMapping("/register")
    public Response register(String Email,String password,String userCode){
        System.out.println(Email);
        System.out.println(password);
        System.out.println(userCode);
        return new Response(false,"注册成功");
    }





}
