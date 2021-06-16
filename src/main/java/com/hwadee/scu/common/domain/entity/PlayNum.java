package com.hwadee.scu.common.domain.entity;

public class PlayNum {
    private String rank;
    private String name;
    private Integer times;

    public PlayNum() {
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTimes() {
        return times;
    }

    public void setTimes(Integer times) {
        this.times = times;
    }

    @Override
    public String toString() {
        return "PlayNum{" +
                "rank='" + rank + '\'' +
                ", name='" + name + '\'' +
                ", times='" + times + '\'' +
                '}';
    }
}
