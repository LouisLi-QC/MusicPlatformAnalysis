package com.hwadee.scu.mapper.extend;

import com.hwadee.scu.common.domain.entity.Area;
import com.hwadee.scu.common.domain.entity.Comment;
import com.hwadee.scu.common.domain.entity.SingerTotalComment;
import com.hwadee.scu.common.domain.entity.likeCount;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @program: musicPlatform
 * @description: 查询数据库的sql
 * @author: fanyang
 * @create: 2021-06-16 18:31
 **/

public interface DataMapper {
    @Select("SELECT Hour(time) as Hour,count(*) as Count FROM cd_comments where time!='00:00:00' GROUP BY HOUR ORDER BY Hour")
    List<Comment> getCdComments();

    @Select("SELECT Hour(time) as Hour,count(*) as Count FROM gdsnaqgs_comments where time!='00:00:00' GROUP BY HOUR ORDER BY Hour")
    List<Comment> getGdComments();

    @Select("SELECT Hour(time) as Hour,count(*) as Count FROM qfl_comments where time!='00:00:00' GROUP BY HOUR ORDER BY Hour")
    List<Comment> getQflComments();

    @Select("SELECT Hour(time) as Hour,count(*) as Count FROM xwzydr_comments where time!='00:00:00' GROUP BY HOUR ORDER BY Hour")
    List<Comment> getXwComments();

    @Select("select left(area,2) as province,count(*) as Count from user_information " +
            "where area!='null' and area not like '%年%' and area not like'%社交%' " +
            "GROUP BY province " +
            "ORDER BY Count DESC")
    List<Area> getAreas();
    @Select("select player as singer,sum(commentsNum) as Count from song_player_commentsnum_mostlikecomnum GROUP BY player  ORDER BY Count DESC")
    List<SingerTotalComment> getTotalComments();

    @Select("SELECT song as name,mostLikeComNum as value from song_player_commentsnum_mostlikecomnum ORDER BY (value+0) Desc limit 10")
    List<likeCount> getLikeCount();

}
