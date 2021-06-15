package com.hwadee.scu;

import com.hwadee.scu.common.util.Email;
import com.hwadee.scu.common.util.StringRedisUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import java.util.Date;

@SpringBootTest
class ScuApplicationTests {

    @Autowired
    StringRedisUtils stringRedisUtils;
    @Autowired
    JavaMailSender javaMailSender;
    public static class Song{

    }
    @Test
    void contextLoads() {
        String test=stringRedisUtils.get("a");
        System.out.println(test);
    }

}
