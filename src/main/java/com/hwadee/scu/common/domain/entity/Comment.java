package com.hwadee.scu.common.domain.entity;

/**
 * @program: musicPlatform
 * @description: 每小时的评论数量
 * @author: fanyang
 * @create: 2021-06-16 18:12
 **/

public class Comment {
    private int hour;
    private int count;
    public Comment(){

    }
    public int getHour(){
        return hour;
    }
    public int getCount(){
        return count;
    }
}
