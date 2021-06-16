package com.hwadee.scu.mapper.extend;

import com.hwadee.scu.common.domain.entity.Comment;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @program: musicPlatform
 * @description:
 * @author: Mr.Like
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


}
