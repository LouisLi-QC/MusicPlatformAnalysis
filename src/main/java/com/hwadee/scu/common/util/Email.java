package com.hwadee.scu.common.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import java.util.Date;

/**
 * @program: musicPlatform
 * @description:
 * @author: fanyang
 * @create: 2021-06-13 16:18
 **/

public class Email {
    @Autowired
    static JavaMailSender javaMailSender;
    public static void sendEmail(String email){
//        // 构建一个邮件对象
//        SimpleMailMessage message = new SimpleMailMessage();
//        // 设置邮件主题
//        message.setSubject("这是一封测试邮件");
//        // 设置邮件发送者，这个跟application.yml中设置的要一致
//        message.setFrom("1763089574@qq.com");
//        // 设置邮件接收者，可以有多个接收者，中间用逗号隔开，以下类似
//        // message.setTo("10*****16@qq.com","12****32*qq.com");
//        message.setTo(email);
//
//        // 设置邮件发送日期
//        message.setSentDate(new Date());
//        // 设置邮件的正文
//        message.setText("这是测试邮件的正文2");
//        // 发送邮件
//        javaMailSender.send(message);
    }
}
