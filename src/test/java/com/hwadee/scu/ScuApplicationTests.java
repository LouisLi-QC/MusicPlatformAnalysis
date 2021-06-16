package com.hwadee.scu;

import com.hwadee.scu.common.domain.entity.Comment;
import com.hwadee.scu.common.util.Email;
import com.hwadee.scu.common.util.StringRedisUtils;
import com.hwadee.scu.mapper.CdCommentsMapper;
import com.hwadee.scu.mapper.extend.DataMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import java.util.Date;
import java.util.List;
import java.util.Map;

@SpringBootTest
class ScuApplicationTests {

    @Autowired
    StringRedisUtils stringRedisUtils;
    @Autowired
    JavaMailSender javaMailSender;
    @Autowired
    CdCommentsMapper cdCommentsMapper;
    @Autowired
    private DataMapper dataMapper;
    public static class Song{

    }
    @Test
    void contextLoads() {
        List<Comment> comments =dataMapper.getCdComments();
        System.out.println(comments.size());
        for(int i=0;i<comments.size();i++){
            System.out.println(comments.get(i).getHour());
            System.out.println(comments.get(i).getCount());
        }

    }

}
