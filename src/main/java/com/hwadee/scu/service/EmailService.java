package com.hwadee.scu.service;

import org.springframework.stereotype.Service;

/**
 * @program: musicPlatform
 * @description:
 * @author: Mr.Like
 * @create: 2021-06-15 09:14
 **/
@Service
public interface EmailService {
    public boolean sendEmail(String Email,String code);//发送邮件
}
