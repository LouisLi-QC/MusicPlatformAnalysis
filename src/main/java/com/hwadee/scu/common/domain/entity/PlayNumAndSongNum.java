package com.hwadee.scu.common.domain.entity;

import java.util.Arrays;

public class PlayNumAndSongNum {
    private PlayNum[] playNums=new PlayNum[10];
    private SongNum[] songNums=new SongNum[10];

    public PlayNumAndSongNum() {
    }

    public PlayNumAndSongNum(PlayNum[] playNums,SongNum[] songNums) {
        this.playNums=playNums;
        this.songNums=songNums;
    }

    public PlayNum[] getPlayNums() {
        return playNums;
    }

    public void setPlayNums(PlayNum[] playNums) {
        this.playNums = playNums;
    }

    public SongNum[] getSongNums() {
        return songNums;
    }

    public void setSongNums(SongNum[] songNums) {
        this.songNums = songNums;
    }

    @Override
    public String toString() {
        return "PlayNumAndSongNum{" +
                "playNums=" + Arrays.toString(playNums) +
                ", songNums=" + Arrays.toString(songNums) +
                '}';
    }
}
