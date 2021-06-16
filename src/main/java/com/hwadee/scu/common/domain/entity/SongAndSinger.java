package com.hwadee.scu.common.domain.entity;

import java.util.Arrays;

public class SongAndSinger {

    private Song[] songs=new Song[10];
    private Singer[] singers=new Singer[10];

    public SongAndSinger() {
    }

    public SongAndSinger(Song[] songs,Singer[] singers) {
        this.songs=songs;
        this.singers=singers;
    }

    public Song[] getSongs() {
        return songs;
    }

    public void setSongs(Song[] songs) {
        this.songs = songs;
    }

    public Singer[] getSingers() {
        return singers;
    }

    public void setSingers(Singer[] singers) {
        this.singers = singers;
    }

    @Override
    public String toString() {
        return "SongAndSinger{" +
                "songs=" + Arrays.toString(songs) +
                ", singers=" + Arrays.toString(singers) +
                '}';
    }
}
