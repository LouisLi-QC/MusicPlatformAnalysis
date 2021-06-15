package com.hwadee.scu.service;

import org.springframework.stereotype.Service;

/**
 * @program: musicPlatform
 * @description:
 * @author: fanyang
 * @create: 2021-06-15 11:25
 **/

public interface AdminService {
    boolean register(String Email,String password);//是否注册成功
    boolean login(String Email,String password);//验证邮箱和密码，验证是否登陆成功

}
