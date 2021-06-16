package com.hwadee.scu.controller;

import com.alibaba.fastjson.JSON;

import com.hwadee.scu.common.domain.CdComNum;
import com.hwadee.scu.common.domain.GdsnaqgsComNum;
import com.hwadee.scu.common.domain.QflComNum;
import com.hwadee.scu.common.domain.XwzydrComNum;
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
        HashMap<String, Object> result = new HashMap<>();
        //广东爱情故事
        List<GdsnaqgsComNum> gdData = wordCloudService.findAllGd();
        List<HashMap<String, Object>> gdListMap = new ArrayList<>();
        for(int i = 0; i<gdData.size(); i++){
            HashMap<String, Object> map = new HashMap<>();
            map.put("name",gdData.get(i).getWord());
            map.put("value",gdData.get(i).getNum());
            gdListMap.add(map);
        }
        result.put("guangdong",gdListMap);
    //成都
        List<CdComNum> cdData = wordCloudService.findAllCd();
        List<HashMap<String, Object>> cdListMap = new ArrayList<>();
        for(int i = 0; i<cdData.size(); i++){
            HashMap<String, Object> map = new HashMap<>();
            map.put("name",cdData.get(i).getWord());
            map.put("value",cdData.get(i).getNum());
            cdListMap.add(map);
        }
        result.put("chengdu",cdListMap);

        //像我这样的人
        List<XwzydrComNum> xwData = wordCloudService.findAllMe();
        List<HashMap<String, Object>> xwListMap = new ArrayList<>();
        for(int i = 0; i<xwData.size(); i++){
            HashMap<String, Object> map = new HashMap<>();
            map.put("name",xwData.get(i).getWord());
            map.put("value",xwData.get(i).getNum());
            xwListMap.add(map);
        }
        result.put("peopleLikeMe",xwListMap);

        //起风了
        List<QflComNum> qflData = wordCloudService.findAllQfl();
        List<HashMap<String, Object>> qflListMap = new ArrayList<>();
        for(int i = 0; i<qflData.size(); i++){
            HashMap<String, Object> map = new HashMap<>();
            map.put("name",qflData.get(i).getWord());
            map.put("value",qflData.get(i).getNum());
            qflListMap.add(map);
        }
        result.put("qifengle",qflListMap);
        String res = JSON.toJSONString(result);
        System.out.println(res);
        return res;
    }
}
