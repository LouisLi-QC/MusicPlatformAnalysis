package com.hwadee.scu.common.domain.entity;

public class Singer {

    private String rank;
    private String name;
    private String times;

    public Singer() {
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

    public String getTimes() {
        return times;
    }

    public void setTimes(String times) {
        this.times = times;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "rank='" + rank + '\'' +
                ", name='" + name + '\'' +
                ", times='" + times + '\'' +
                '}';
    }
}
