package com.hwadee.scu.service.impl;

import com.hwadee.scu.common.domain.*;
import com.hwadee.scu.common.domain.entity.Singer;
import com.hwadee.scu.common.domain.entity.Song;
import com.hwadee.scu.common.domain.entity.SongAndSinger;
import com.hwadee.scu.mapper.MusicListMapper;
import com.hwadee.scu.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class MusicServiceImpl implements MusicService {

    @Autowired
    private MusicListMapper musicListMapper;

    @Override
    //获取歌单出现次数排名前十的歌曲和歌手
    public SongAndSinger getSongAndSinger() {
        SongAndSinger songAndSinger=new SongAndSinger(this.getSong(),this.getSinger());
        return songAndSinger;
    }

    @Override
    //获取歌单出现次数排名前十的歌曲
    public Song[] getSong() {
        Song[] songs=new Song[10];

        MusicListExample musicListExample=new MusicListExample();
        List<MusicList> musicList=musicListMapper.selectByExample(musicListExample);
        //创建一个map存储歌曲名称和出现次数
        Map<String,Long> count=new HashMap();
        for (MusicList music:musicList) {
            MusicListExample.Criteria criteria=musicListExample.createCriteria();
            criteria.andMusicnameEqualTo(music.getMusicname());
            count.put(music.getMusicname(),musicListMapper.countByExample(musicListExample));
            musicListExample.clear();
        }
        //把map转成list并按value排序
        List<Map.Entry<String,Long>> SongCount=new ArrayList<>(count.entrySet());
        Collections.sort(SongCount,(((o1, o2) -> {
            return o1.getValue().compareTo(o2.getValue())*(-1);
        })));
        //取出前十的歌曲
        for (int i=0;i<10;i++){
            Map.Entry<String,Long> map=SongCount.get(i);
            songs[i].setRank(String.valueOf(i));
            songs[i].setName(map.getKey());
            songs[i].setTimes(String.valueOf(map.getValue()));
            System.out.println(map.getKey()+":"+map.getValue());
        }
        return songs;
    }

    @Override
    //获取歌单出现次数排名前十的歌手
    public Singer[] getSinger() {
        Singer[] singers=new Singer[10];

        MusicListExample musicListExample=new MusicListExample();
        List<MusicList> musicList=musicListMapper.selectByExample(musicListExample);
        //创建一个map存储歌曲名称和出现次数
        Map<String,Long> count=new HashMap();
        for (MusicList music:musicList) {
            MusicListExample.Criteria criteria=musicListExample.createCriteria();
            criteria.andAuthorEqualTo(music.getAuthor());
            count.put(music.getAuthor(),musicListMapper.countByExample(musicListExample));
            musicListExample.clear();
        }
        //把map转成list并按value排序
        List<Map.Entry<String,Long>> SingerCount=new ArrayList<>(count.entrySet());
        Collections.sort(SingerCount,(((o1, o2) -> {
            return o1.getValue().compareTo(o2.getValue())*(-1);
        })));
        //取出前十的歌手
        for (int i=0;i<10;i++){
            Map.Entry<String,Long> map=SingerCount.get(i);
            singers[i].setRank(String.valueOf(i));
            singers[i].setName(map.getKey());
            singers[i].setTimes(String.valueOf(map.getValue()));
            System.out.println(map.getKey()+":"+map.getValue());
        }
        return singers;
    }
}
