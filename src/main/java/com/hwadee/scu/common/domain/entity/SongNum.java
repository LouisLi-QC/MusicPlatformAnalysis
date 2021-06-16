package com.hwadee.scu.common.domain.entity;

public class SongNum {
    private String rank;
    private String name;
    private String songs;

    public SongNum() {
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

    public String getSongs() {
        return songs;
    }

    public void setSongs(String songs) {
        this.songs = songs;
    }

    @Override
    public String toString() {
        return "SongNum{" +
                "rank='" + rank + '\'' +
                ", name='" + name + '\'' +
                ", songs='" + songs + '\'' +
                '}';
    }
}
