package com.hwadee.scu.service;

import com.hwadee.scu.common.domain.entity.Area;
import com.hwadee.scu.common.domain.entity.Comment;
import com.hwadee.scu.common.domain.entity.SingerTotalComment;
import com.hwadee.scu.common.domain.entity.likeCount;
import com.hwadee.scu.mapper.extend.DataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: musicPlatform
 * @description:
 * @author: fanyang
 * @create: 2021-06-16 18:26
 **/
@Service
public class DataServiceImpl implements DataService {
    @Autowired
    private DataMapper dataMapper;
    /**
     * create by: fanyang
     * description: 获取四首歌的评论时间分布
     * params:无参数
     * return:返回一个
     * create time:
     */
    @Override
    public List<List<Comment>> getComment() {
        List<List<Comment>> res=new ArrayList<>();
        List<Comment> comments1=dataMapper.getCdComments();//成都
        List<Comment> comments2=dataMapper.getGdComments();//广东
        List<Comment> comments3=dataMapper.getQflComments();//起风了
        List<Comment> comments4=dataMapper.getXwComments();//像我这样
        res.add(comments1);
        res.add(comments2);
        res.add(comments3);
        res.add(comments4);
        return res;
    }

    /**
     * create by: fanyang
     * description: 返回用户的地区分布
     * params:无
     * return:返回一个list<Area>
     * create time:
     */
    @Override
    public List<Area> getAreas() {
        List<Area> areas=dataMapper.getAreas();
        return areas;
    }

    /**
     * create by: fanyang
     * description: 获得所有歌手所属歌曲的所有播放量之和
     * params:
     * return:返回一个List<SingerTotalComment>
     * create time:
     */
    @Override
    public List<SingerTotalComment> getTotalComment() {
        List<SingerTotalComment> totalComments=dataMapper.getTotalComments();
        return totalComments;
    }

    /**
     * create by: fanyang
     * description: 获得所有歌的歌名以及对应的最高点赞数量
     * params:
     * return:
     * create time:
     */
    @Override
    public List<likeCount> getLikeCount() {
        List<likeCount> likeCounts=dataMapper.getLikeCount();
        return likeCounts;
    }
}
