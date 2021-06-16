package com.hwadee.scu.service.impl;

import com.hwadee.scu.common.domain.MusicList;
import com.hwadee.scu.common.domain.MusicListExample;
import com.hwadee.scu.common.domain.PlaylistNumber;
import com.hwadee.scu.common.domain.PlaylistNumberExample;
import com.hwadee.scu.common.domain.entity.PlayNum;
import com.hwadee.scu.common.domain.entity.PlayNumAndSongNum;
import com.hwadee.scu.common.domain.entity.SongNum;
import com.hwadee.scu.mapper.MusicListMapper;
import com.hwadee.scu.mapper.PlaylistNumberMapper;
import com.hwadee.scu.service.PlayListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PlayListServiceImpl implements PlayListService {

    @Autowired
    private PlaylistNumberMapper playlistNumberMapper;
    @Autowired
    private MusicListMapper musicListMapper;

    @Override
    public PlayNumAndSongNum getPlayList() {
        return new PlayNumAndSongNum(this.getPlayNum(),this.getSongNum());
    }

    @Override
    //获取播放量前十的歌单
    public PlayNum[] getPlayNum() {
        PlayNum[] playNums=new PlayNum[10];

        //获取播放量前十的歌单
        List<PlaylistNumber> playlistNumber=playlistNumberMapper.selectByExample(new PlaylistNumberExample());
        Collections.sort(playlistNumber,(((o1, o2) -> o1.getPlaynumber().compareTo(o2.getPlaynumber())*(-1))));
        for (int i=0;i<10;i++){
            playNums[i]=new PlayNum();
            playNums[i].setRank(String.valueOf(i+1));
            playNums[i].setName(playlistNumber.get(i).getListname());
            playNums[i].setTimes(playlistNumber.get(i).getPlaynumber());
        }
        return playNums;
    }

    @Override
    //获取包含曲目前十的歌单
    public SongNum[] getSongNum() {
        SongNum[] songNums=new SongNum[10];

        PlaylistNumberExample playlistNumberExample=new PlaylistNumberExample();
        List<PlaylistNumber> playlistNumber=playlistNumberMapper.selectByExample(playlistNumberExample);
        MusicListExample musicListExample=new MusicListExample();
        List<MusicList> musicList=musicListMapper.selectByExample(musicListExample);
        Set<String> listName=new HashSet();
        for (MusicList music:musicList) {
            if(music.getListname()!=null){
                listName.add(music.getListname());
            }
        }
        //创建一个map存储歌曲名称和出现次数
        Map<String,Long> count=new HashMap();
        for (String list:listName) {
            MusicListExample.Criteria criteria=musicListExample.createCriteria();
            criteria.andListnameEqualTo(list);
            count.put(list,musicListMapper.countByExample(musicListExample));
            musicListExample.clear();
        }
        //把map转成list并按value排序
        List<Map.Entry<String,Long>> SongCount=new ArrayList<>(count.entrySet());
        Collections.sort(SongCount,(((o1, o2) -> o1.getValue().compareTo(o2.getValue())*(-1))));
        //取出包含曲目前十的歌单
        for (int i=0;i<10;i++){
            Map.Entry<String,Long> map=SongCount.get(i);
            songNums[i]=new SongNum();
            songNums[i].setRank(String.valueOf(i+1));
            songNums[i].setName(map.getKey());
            songNums[i].setSongs(String.valueOf(map.getValue()));
            System.out.println(map.getKey()+":"+map.getValue());
        }
        return songNums;
    }
}
