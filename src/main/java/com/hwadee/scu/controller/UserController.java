package com.hwadee.scu.controller;

import com.hwadee.scu.common.domain.entity.AreaMap;
import com.hwadee.scu.common.domain.entity.User;
import com.hwadee.scu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/charts")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/userInformation")
    @ResponseBody
    public User getUserInfo(){
        return userService.getUserInfo();
    }

    @RequestMapping("/areaMap")
    @ResponseBody
    public AreaMap getAreaMap(){
        return userService.getAreaMap();
    }

}
