package com.hwadee.scu.controller;

import com.alibaba.fastjson.JSON;

import com.hwadee.scu.common.domain.GdsnaqgsComNum;
import com.hwadee.scu.service.WordCloudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("/charts")
public class WordCloudController {
    @Autowired
    private WordCloudService wordCloudService;

    @RequestMapping("/wordCloud")
    @ResponseBody
    public String getWordCloud(){
        List<GdsnaqgsComNum> gdData = wordCloudService.findAllGd();
        HashMap<String, Object> gdRes = new HashMap<>();
        List<HashMap<String, Object>> list = new ArrayList<>();
        for(int i = 0; i<gdData.size(); i++){
            HashMap<String, Object> map = new HashMap<>();
            map.put("word",gdData.get(i).getWord());
            map.put("num",gdData.get(i).getNum());
            list.add(map);
        }
        gdRes.put("guangDong",list);
        String res = JSON.toJSONString(gdRes);
        System.out.println(res);
        return res;

    }
}
