package com.hwadee.scu.common.domain.entity;

import java.util.Arrays;

public class Comments {

    private long[] guangDong=new long[24];
    private long[] peopleLikeME=new long[24];
    private long[] qiFengLe=new long[24];
    private long[] chengDu=new long[24];

    public Comments() {
    }

    public long[] getGuangDong() {
        return guangDong;
    }

    public void setGuangDong(long[] guangDong) {
        this.guangDong = guangDong;
    }

    public long[] getPeopleLikeME() {
        return peopleLikeME;
    }

    public void setPeopleLikeME(long[] peopleLikeME) {
        this.peopleLikeME = peopleLikeME;
    }

    public long[] getQiFengLe() {
        return qiFengLe;
    }

    public void setQiFengLe(long[] qiFengLe) {
        this.qiFengLe = qiFengLe;
    }

    public long[] getChengDu() {
        return chengDu;
    }

    public void setChengDu(long[] chengDu) {
        this.chengDu = chengDu;
    }

    @Override
    public String toString() {
        return "Comments{" +
                "guangdong=" + Arrays.toString(guangDong) +
                ", peopleLikeME=" + Arrays.toString(peopleLikeME) +
                ", qiFengLe=" + Arrays.toString(qiFengLe) +
                ", chengDu=" + Arrays.toString(chengDu) +
                '}';
    }
}
