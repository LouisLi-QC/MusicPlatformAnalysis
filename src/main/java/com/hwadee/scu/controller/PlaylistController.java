package com.hwadee.scu.controller;

import com.alibaba.fastjson.JSON;
import com.hwadee.scu.common.domain.PlaylistNumber;
import com.hwadee.scu.common.domain.entity.PlayList;
import com.hwadee.scu.service.PlaylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("/charts")
public class PlaylistController {
    @Autowired
    private PlaylistService playlistService;

    @RequestMapping("/playLists")
    @ResponseBody
    public String PlayLists(){
        System.out.println("开始");
        HashMap<String, Object> res = new HashMap<>();
        //播放量前十
        List<PlaylistNumber> numberData = playlistService.selectPlayNumber(); //数据库取出数据
        List<String> nameList1 = new ArrayList<>(); //存歌单名
        List<Integer> numberList1 = new ArrayList<>(); //存播放量
        for (int i = 0 ;i<numberData.size(); i++){
            nameList1.add(numberData.get(i).getListname());
            numberList1.add(numberData.get(i).getPlaynumber());
        }
        //存入map
        HashMap<String, Object> numberRes = new HashMap<>();
        numberRes.put("listName",nameList1);
        numberRes.put("playNumber",numberList1);
        System.out.println("中间");

        //歌曲数前十
        List<PlayList> songData = playlistService.selectListSong(); //数据库取出数据
        List<String> nameList2 = new ArrayList<>(); //存歌单名
        List<Integer> numberList2 = new ArrayList<>(); //存播放量
        for (int i = 0 ;i<songData.size(); i++){
            nameList2.add(songData.get(i).getListName());
            numberList2.add(songData.get(i).getCount());
        }
        //存入map
        HashMap<String, Object> songRes = new HashMap<>();
        songRes.put("listName",nameList2);
        songRes.put("songNumber",numberList2);
        //两次结果存入map
        res.put("playNumber",numberRes);
        res.put("songNumber",songRes);
        //转为json
        String s = JSON.toJSONString(res);
        System.out.println("结束");
        return s;
    }
}
