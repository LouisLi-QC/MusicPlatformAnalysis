package com.hwadee.scu.controller;

import com.hwadee.scu.common.util.MD5;
import com.hwadee.scu.common.util.Response;
import com.hwadee.scu.common.util.StringRedisUtils;
import com.hwadee.scu.service.EmailService;
import com.hwadee.scu.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * create by: fanyang
 * description: 前端登陆的controller
 * create time:
 */
@RestController
@CrossOrigin
@RequestMapping("/admin")
public class LoginController {
    @Autowired
    private StringRedisUtils stringRedisUtils;
    @Autowired
    static JavaMailSender javaMailSender;
    @Autowired
    EmailService emailService;
    @Autowired
    MD5 md5;
    @Autowired
    AdminService loginService;
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
        boolean sendFlag=emailService.sendEmail(Email,code);//发送验证码
        boolean expireFlag=stringRedisUtils.expire(Email,code,15*60);//将验证码存入redis并设置过期时间
        if(sendFlag&&expireFlag){
            return new Response(true,"验证码发送成功");
        }
        return new Response(false,"验证码发送失败");
    }

    /**
     * create by: fanyang
     * description: 用户注册
     * params:Email为邮箱，password为密码，userCode为用户输入的验证码
     * return:410代表验证码过期，200代码注册成功
     * create time:
     */
    @RequestMapping("/register")
    public Response register(String Email, String password, String userCode){
        String pwd=md5.getMD5(password);//加密后的密码
        String realCode=stringRedisUtils.get(Email);//从redis中读取验证码
        //如果用户输入的验证码和系统生成的验证码一致，则成功注册
        if(realCode==null){
            return new Response(false,410,"验证码已过期");
        }
        if(realCode.equals(userCode)){
            boolean flag=loginService.register(Email,pwd);
            return flag?new Response(true,200,"注册成功"):new Response(false,412,"未知的错误，请重试");
        }

        return new Response(false,411,"验证码错误，注册失败");
    }

    /**
     * create by: fanyang
     * description:
     * params:
     * return:
     * create time:
     */
    @RequestMapping("/login")
    public Response login(String Email,String password){
        System.out.println(Email);
        System.out.println(password);
        String pwd=md5.getMD5(password);//加密后的密码
        boolean loginFlag=loginService.login(Email,pwd);
        return loginFlag?new Response(true,200,"登陆成功"):new Response(false,411,"密码错误");
    }






}
