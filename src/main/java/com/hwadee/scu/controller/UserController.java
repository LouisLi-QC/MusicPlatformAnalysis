package com.hwadee.scu.controller;

import com.alibaba.fastjson.JSON;
import com.hwadee.scu.common.domain.entity.AreaMap;
import com.hwadee.scu.common.domain.entity.UserLevel;
import com.hwadee.scu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("/charts")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/userInformation")
    @ResponseBody
    public String getUserInfo(){
        HashMap<String, Object> res = new HashMap<>();
        List<UserLevel> levelData = userService.getAllUserLevel();
        List<HashMap<String, Object>> levelRes = new ArrayList<>();
        for(int i = 0; i<levelData.size(); i++){
            HashMap<String, Object> temp = new HashMap<>();
            temp.put("value",levelData.get(i).getNumber());
            temp.put("name", levelData.get(i).getLevel());
            levelRes.add(temp);
        }
        res.put("userInfo",userService.getUserInfo());
        res.put("levelInfo",levelRes);
        return JSON.toJSONString(res);
    }

    @RequestMapping("/areaMap")
    @ResponseBody
    public AreaMap getAreaMap(){
        return userService.getAreaMap();
    }

}
