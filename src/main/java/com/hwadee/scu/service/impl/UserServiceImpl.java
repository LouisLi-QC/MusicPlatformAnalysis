package com.hwadee.scu.service.impl;

import com.hwadee.scu.common.domain.*;
import com.hwadee.scu.common.domain.entity.AreaMap;
import com.hwadee.scu.common.domain.entity.User;
import com.hwadee.scu.common.domain.entity.UserCount;
import com.hwadee.scu.common.domain.entity.UserLevel;
import com.hwadee.scu.mapper.*;
import com.hwadee.scu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private userInformationMapper userInformationMapper;
    @Autowired
    private CdCommentsMapper cdCommentsMapper;
    @Autowired
    private GdsnaqgsCommentsMapper gdsnaqgsCommentsMapper;
    @Autowired
    private QflCommentsMapper qflCommentsMapper;
    @Autowired
    private XwzydrCommentsMapper xwzydrCommentsMapper;

    @Override
    //获取VIP、普通用户、男用户以及女用户的数目信息
    public User getUserInfo() {
        User user=new User(new UserCount(this.getCountsByVip("1"),"VIP用户"),
                           new UserCount(this.getCountsByVip("0"),"普通用户"),
                           new UserCount(this.getCountsBySex("m"),"男"),
                           new UserCount(this.getCountsBySex("f"),"女"));
        return user;
    }

    @Override
    //获取用户地区分布信息
    public AreaMap getAreaMap() {
        AreaMap areaMap=new AreaMap();

        userInformationExample userInformationExample=new userInformationExample();
        List<userInformation> userInformation=userInformationMapper.selectByExample(userInformationExample);
        //创建一个map存储歌曲名称和出现次数
        Set<String> areas=new HashSet();
        for (userInformation user:userInformation) {
            if(user.getArea()!=null){
                areas.add(user.getArea());
            }
        }
        Map<String,Long> areaCounts=new HashMap<>();
        for (String area:areas) {
            userInformationExample.Criteria criteria=userInformationExample.createCriteria();
            criteria.andAreaEqualTo(area);
            areaCounts.put(area,userInformationMapper.countByExample(userInformationExample));
        }
        //把map转成list并按value排序
        List<Map.Entry<String,Long>> areaList=new ArrayList<>(areaCounts.entrySet());
        Collections.sort(areaList,(((o1, o2) -> {
            return o1.getValue().compareTo(o2.getValue())*(-1);
        })));
        //取出前十的歌曲
        for (int i=0;i<areaList.size();i++){
            Map.Entry<String,Long> map=areaList.get(i);
            areaCounts.put(map.getKey(),(long)i+1);
            System.out.println(map.getKey()+":"+map.getValue());
        }
        areaMap.setAreaMap(areaCounts);

        return areaMap;
    }

    @Override
    //获取VIP和普通用户的数目信息
    public Long getCountsByVip(String VIP) {
        //获取成都评论中VIP或普通用户的人数
        CdCommentsExample cdCommentsExample=new CdCommentsExample();
        CdCommentsExample.Criteria CdCommentsExample_criteria=cdCommentsExample.createCriteria();
        CdCommentsExample_criteria.andVipEqualTo(VIP);
        long cdVIPCounts=cdCommentsMapper.countByExample(cdCommentsExample);

        //获取广东爱情故事评论中VIP或普通用户的人数
        GdsnaqgsCommentsExample gdsnaqgsCommentsExample=new GdsnaqgsCommentsExample();
        GdsnaqgsCommentsExample.Criteria gdsnaqgsCommentsExample_criteria=gdsnaqgsCommentsExample.createCriteria();
        gdsnaqgsCommentsExample_criteria.andVipEqualTo(VIP);
        long gdsnaqgsVIPCounts=gdsnaqgsCommentsMapper.countByExample(gdsnaqgsCommentsExample);

        //获取起风了评论中VIP或普通用户的人数
        QflCommentsExample qflCommentsExample=new QflCommentsExample();
        QflCommentsExample.Criteria qflCommentsExample_criteria=qflCommentsExample.createCriteria();
        qflCommentsExample_criteria.andVipEqualTo(Integer.valueOf(VIP));
        long qflVIPCounts=qflCommentsMapper.countByExample(qflCommentsExample);

        //获取像我这样的人评论中VIP或普通用户的人数
        XwzydrCommentsExample xwzydrCommentsExample=new XwzydrCommentsExample();
        XwzydrCommentsExample.Criteria xwzydrCommentsExample_criteria=xwzydrCommentsExample.createCriteria();
        xwzydrCommentsExample_criteria.andVipEqualTo(VIP);
        long xwzydrVIPCounts=xwzydrCommentsMapper.countByExample(xwzydrCommentsExample);

        //返回VIP或普通用户总数
        return cdVIPCounts+gdsnaqgsVIPCounts+qflVIPCounts+xwzydrVIPCounts;
    }

    @Override
    //获取男用户以及女用户的数目信息
    public Long getCountsBySex(String sex) {
        userInformationExample userInformationExample=new userInformationExample();
        userInformationExample.Criteria userInformationExample_criteria=userInformationExample.createCriteria();
        userInformationExample_criteria.andSexEqualTo(sex);
        Long sexCounts=userInformationMapper.countByExample(userInformationExample);
        return sexCounts;
    }

    @Override
    public List<UserLevel> getAllUserLevel() {
        return userInformationMapper.getAllUserLevel();
    }
}
