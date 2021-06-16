package com.hwadee.scu.service;

import com.hwadee.scu.common.domain.entity.AreaMap;
import com.hwadee.scu.common.domain.entity.User;

public interface UserService {
    //获取VIP、普通用户、男用户以及女用户的数目信息
    User getUserInfo();

    //获取用户地区分布信息
    AreaMap getAreaMap();

    //获取VIP和普通用户的数目信息
    Long getCountsByVip(String VIP);

    //获取男用户以及女用户的数目信息
    Long getCountsBySex(String sex);
}
