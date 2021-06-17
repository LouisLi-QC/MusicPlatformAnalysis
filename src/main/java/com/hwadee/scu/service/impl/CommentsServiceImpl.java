package com.hwadee.scu.service.impl;

import com.hwadee.scu.common.domain.*;
import com.hwadee.scu.common.domain.entity.Comments;
import com.hwadee.scu.mapper.CdCommentsMapper;
import com.hwadee.scu.mapper.GdsnaqgsCommentsMapper;
import com.hwadee.scu.mapper.QflCommentsMapper;
import com.hwadee.scu.mapper.XwzydrCommentsMapper;
import com.hwadee.scu.service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Time;

@Service
public class CommentsServiceImpl implements CommentsService {

    @Autowired
    private CdCommentsMapper cdCommentsMapper;
    @Autowired
    private GdsnaqgsCommentsMapper gdsnaqgsCommentsMapper;
    @Autowired
    private QflCommentsMapper qflCommentsMapper;
    @Autowired
    private XwzydrCommentsMapper xwzydrCommentsMapper;

    @Override
    //获取每首歌各个时段的评论数
    public Comments getCommentsByTime() {

        Comments comments=new Comments();

        //获取成都各个时段的评论数
        CdCommentsExample cdCommentsExample=new CdCommentsExample();
        long[] cdCounts = new long[24];
        for(int i=0;i<24;i++){
            Time startTime = new Time(i,0,0);
            Time endTime = new Time(i+1,0,0);
            if(i==23){
                endTime=new Time(23,59,59);
            }
            CdCommentsExample.Criteria CdCommentsExample_criteria=cdCommentsExample.createCriteria();
            CdCommentsExample_criteria.andTimeBetween(startTime,endTime);
            cdCounts[i]=cdCommentsMapper.countByExample(cdCommentsExample);
            cdCommentsExample.clear();
        }
        comments.setChengDu(cdCounts);

        //获取广东爱情故事各个时段的评论数
        GdsnaqgsCommentsExample gdsnaqgsCommentsExample=new GdsnaqgsCommentsExample();
        long[] gdsnaqgsCounts = new long[24];
        for(int i=0;i<24;i++){
            Time startTime = new Time(i,0,0);
            Time endTime = new Time(i+1,0,0);
            if(i==23){
                endTime=new Time(23,59,59);
            }
            GdsnaqgsCommentsExample.Criteria gdsnaqgsCommentsExample_criteria=gdsnaqgsCommentsExample.createCriteria();
            gdsnaqgsCommentsExample_criteria.andTimeBetween(startTime,endTime);
            gdsnaqgsCounts[i]=gdsnaqgsCommentsMapper.countByExample(gdsnaqgsCommentsExample);
            gdsnaqgsCommentsExample.clear();
        }
        comments.setGuangDong(gdsnaqgsCounts);

        //获取起风了各个时段的评论数
        QflCommentsExample qflCommentsExample=new QflCommentsExample();
        long[] qflCounts = new long[24];
        for(int i=0;i<24;i++){
            Time startTime = new Time(i,0,0);
            Time endTime = new Time(i+1,0,0);
            if(i==23){
                endTime=new Time(23,59,59);
            }
            QflCommentsExample.Criteria qflCommentsExample_criteria=qflCommentsExample.createCriteria();
            qflCommentsExample_criteria.andTimeBetween(startTime,endTime);
            qflCounts[i]=qflCommentsMapper.countByExample(qflCommentsExample);
            qflCommentsExample.clear();
        }
        comments.setQiFengLe(qflCounts);

        //获取像我这样的人各个时段的评论数
        XwzydrCommentsExample xwzydrCommentsExample=new XwzydrCommentsExample();
        long[] xwzydrCounts = new long[24];
        for(int i=0;i<24;i++){
            Time startTime = new Time(i,0,0);
            Time endTime = new Time(i+1,0,0);
            if(i==23){
                endTime=new Time(23,59,59);
            }
            XwzydrCommentsExample.Criteria xwzydrCommentsExample_criteria=xwzydrCommentsExample.createCriteria();
            xwzydrCommentsExample_criteria.andTimeBetween(startTime,endTime);
            xwzydrCounts[i]=xwzydrCommentsMapper.countByExample(xwzydrCommentsExample);
            xwzydrCommentsExample.clear();
        }
        comments.setPeopleLikeME(xwzydrCounts);

        return comments;
    }


}
