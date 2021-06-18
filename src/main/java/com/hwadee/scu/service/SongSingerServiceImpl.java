package com.hwadee.scu.service;

import com.alibaba.fastjson.JSON;
import com.hwadee.scu.common.domain.entity.Singer;
import com.hwadee.scu.common.domain.entity.Song;
import com.hwadee.scu.mapper.MusicListMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
@Service
public class SongSingerServiceImpl implements SongSingerService {
    @Autowired
    private MusicListMapper musicListMapper;


    @Override
    public String getSongSinger() {
        //歌曲
        List<Song> songData = musicListMapper.getSong();
        List<String> songName = new ArrayList<>();
        List<Integer> songTimes = new ArrayList<>();
        for(int i = 0; i<songData.size(); i++){
            songName.add(songData.get(i).getMusicName());
            songTimes.add(songData.get(i).getTimes());
        }
        //歌手
        List<Singer> singerData = musicListMapper.getSinger();
        List<String> singerName = new ArrayList<>();
        List<Integer> singerTimes = new ArrayList<>();
        for(int i = 0; i<singerData.size(); i++){
            singerName.add(singerData.get(i).getAuthor());
            singerTimes.add(singerData.get(i).getTimes());
        }
        HashMap<String, Object> resMap = new HashMap<>();
        resMap.put("songName",songName);
        resMap.put("songTimes", songTimes);
        resMap.put("singerName",singerName);
        resMap.put("singerTimes",singerTimes);
        return JSON.toJSONString(resMap);
    }
}
