package com.hwadee.scu.common.domain.entity;

/**
 * @program: musicPlatform
 * @description: 每首歌的最高点赞量
 * @author: fanyang
 * @create: 2021-06-17 14:45
 **/

public class likeCount {
    private String song;
    private int count;
    public String getSong(){
        return song;
    }
    public int getCount(){
        return count;
    }
}
