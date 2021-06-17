package com.hwadee.scu.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.hwadee.scu.common.domain.entity.Area;
import com.hwadee.scu.common.domain.entity.Comment;
import com.hwadee.scu.common.domain.entity.Singer;
import com.hwadee.scu.common.domain.entity.SingerTotalComment;
import com.hwadee.scu.common.util.PinYinUtil;
import com.hwadee.scu.mapper.extend.DataMapper;
import com.hwadee.scu.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: musicPlatform
 * @description:
 * @author: fanyang
 * @create: 2021-06-16 18:25
 **/
@RestController
@RequestMapping("/data")
public class DataController {
    @Autowired
    private DataService dataService;

    /**
     * create by: fanyang
     * description: 获得四首歌的评论时间分布
     * params:无
     * return:返回四个json数据，里面有四个数组
     * create time:
     */
    @RequestMapping("/getComment")
    public String getComment(){
        List<List<Comment>> commentList=dataService.getComment();
        Map<String,Object> map=new HashMap<>();
        String[] names=new String[]{"chengDu","guangDong","qiFengLe","peopleLikeME"};//四首歌的名字
        for(int i=0;i<commentList.size();i++){
            int[] tmp=new int[24];
            for(int j=0;j<commentList.get(i).size();j++){
                tmp[j]=commentList.get(i).get((j+1)%24).getCount();//从凌晨一点开始赋值
            }
            map.put(names[i],tmp);
        }
        JSONObject json = new JSONObject(map);
        String res=json.toString();
        return res;
    }
    /**
     * create by: fanyang
     * description: 获得地区分布
     * params:无
     * return:返回每个省份以及对应的人数
     * create time:
     */
    @RequestMapping("/getAreaMap")
    public String getAreaMap(){
        List<Area> areas=dataService.getAreas();
        Map<String,Integer> map=new HashMap<>();
        for(int i=0;i<areas.size();i++){
            if(!map.containsKey(PinYinUtil.getPinyin(areas.get(i).getProvince())))
            {
                map.put(PinYinUtil.getPinyin(areas.get(i).getProvince()),areas.get(i).getCount());
            }
            else
            {
                map.put(areas.get(i).getProvince()+PinYinUtil.getPinyin(areas.get(i).getProvince()),areas.get(i).getCount());
            }
        }

        return JSON.toJSONString(map);
    }

    @RequestMapping("/getTotalComment")
    public String getTotalComment(){
        List<SingerTotalComment> singerTotalComments=dataService.getTotalComment();
        List<String> singer=new ArrayList<>();
        List<Integer> commentCount=new ArrayList<>();
        Map<String,Object> map=new HashMap<>();
        for(int i=0;i<singerTotalComments.size();i++){
            singer.add(singerTotalComments.get(i).getSinger());
            commentCount.add(singerTotalComments.get(i).getCount());
        }
        map.put("singer",singer);
        map.put("comment",commentCount);
        return JSON.toJSONString(map);
    }
}
