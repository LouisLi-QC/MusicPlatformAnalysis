package com.hwadee.scu.common.domain.entity;

/**
 * @program: musicPlatform
 * @description: 歌手的所有歌曲的播放量
 * @author: fanyang
 * @create: 2021-06-17 11:24
 **/

public class SingerTotalComment {
    private String singer;

    private int count;

    public SingerTotalComment(){

    }
    public String getSinger(){
        return singer;
    }
    public int getCount(){
        return count;
    }
}
