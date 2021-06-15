package com.hwadee.scu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @program: musicPlatform
 * @description:
 * @author: fanyang
 * @create: 2021-06-15 09:14
 **/
@Service
public class EmailServiceImpl implements EmailService {

    @Autowired
    JavaMailSender javaMailSender;
    @Override
    public boolean sendEmail(String Email,String code) {
        SimpleMailMessage message = new SimpleMailMessage();
        // 设置邮件主题
        message.setSubject("欢迎注册网易云音乐大数据平台");
        // 设置邮件发送者，这个跟application.yml中设置的要一致
        message.setFrom("2717199940@qq.com");
        // 设置邮件接收者，可以有多个接收者，中间用逗号隔开，以下类似
        // message.setTo("10*****16@qq.com","12****32*qq.com");
        message.setTo(Email);
        // 设置邮件发送日期
        message.setSentDate(new Date());
        // 设置邮件的正文
        message.setText("欢迎注册网易云音乐大数据平台,这是您的验证码:"+code+"。请在十五分钟内使用，请不要将验证码告诉他人。");
        // 发送邮件
        javaMailSender.send(message);
        return true;
    }
}
