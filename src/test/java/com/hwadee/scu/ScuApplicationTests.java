package com.hwadee.scu;

import com.hwadee.scu.common.domain.Admin;
import com.hwadee.scu.common.domain.entity.Area;
import com.hwadee.scu.common.domain.entity.Comment;
import com.hwadee.scu.common.util.Email;
import com.hwadee.scu.common.util.PinYinUtil;
import com.hwadee.scu.common.util.RedisUtils;
import com.hwadee.scu.common.util.StringRedisUtils;
import com.hwadee.scu.mapper.CdCommentsMapper;
import com.hwadee.scu.mapper.extend.DataMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
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

    @Autowired
    private RedisUtils redisUtils;
    public static class Song{

    }
    @Test
    void contextLoads() {
//        List<Comment> comments =dataMapper.getCdComments();
//        System.out.println(comments.size());
//        for(int i=0;i<comments.size();i++){
//            System.out.println(comments.get(i).getHour());
//            System.out.println(comments.get(i).getCount());
//        }
//
//        List<Area> areas=dataMapper.getAreas();
//        System.out.println(areas.size());
//        for(int i=0;i<areas.size();i++){
//
//            System.out.println( PinYinUtil.getPinyin(areas.get(i).getProvince()));
//            System.out.println(areas.get(i).getCount());
//        }

//        Map<String,Object> map=new HashMap<>();
//        Admin admin=new Admin();
//        admin.setId(1);
//        admin.setEmail("321132");
//        admin.setPassword("1234");
//        map.put("name",admin);
//        System.out.println("开始写入redis");
//        System.out.println(map.get("name"));
//        redisUtils.Hset("fanyang",map);
//        RedisUtils.Hset("1763089574@qq.com",map);
//        RedisUtils.addAllHashValue("1763089574@qq.com",map);
//        System.out.println("测试");
//        session.setAttribute("sessionId","13213");
//        session.setAttribute("name","fy");
//        session.setAttribute("age","18");
//        redisUtils.set("ceshi",session);
//        Map<String,Object> map=new HashMap<>();
//        map.put("name","fanyang");
//        map.put("age","18");
//        map.put("age","19");
//        redisUtils.Hset("176",map);
//        String res= (String) redisUtils.Hget("176","age");
//        System.out.println(res);



    }

}
