package com.hwadee.scu.common.domain.entity;

/**
 * @program: musicPlatform
 * @description: 每个省份的用户数量
 * @author: fanyang
 * @create: 2021-06-17 09:40
 **/

public class Area {

    private String province;

    private int count;

    public Area(){

    }
    public String getProvince(){
        return province;
    }
    public int getCount(){
        return count;
    }
}
