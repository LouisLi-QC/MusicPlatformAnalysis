package com.hwadee.scu.controller;


import com.hwadee.scu.common.util.RedisUtils;
import com.hwadee.scu.service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.cache.CacheProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RequestMapping("/test")
@RestController
public class TestController {
    @Autowired
    CommentsService commentsService;
    @Autowired
    private RedisUtils redisUtils;
    @RequestMapping("/EnterToCheckInfo")
    public int EnterToCheckInfo(HttpSession session){

        session.setAttribute("sessionId","13213");
        session.setAttribute("name","fy");
        session.setAttribute("age","18");
        boolean flag=redisUtils.set("ceshi",session);
        return flag?200:400;
    }
//    @RequestMapping("/hour")
//    public int[] test(){
//        int[] res=commentsService.getCommentsByHour();
//        return res;
//    }
   @RequestMapping("/set")
    String set(HttpServletRequest req) {
    req.getSession().setAttribute("testKey", "testValue");
    return "设置session:testKey=testValue";
}

    @RequestMapping("/query")
    String query(HttpServletRequest req) {
        Object value = req.getSession().getAttribute("testKey");
        return "查询Session：\"testKey\"=" + value;
    }
}
