package com.hwadee.scu.service;

import com.hwadee.scu.common.domain.entity.Area;
import com.hwadee.scu.common.domain.entity.Comment;
import com.hwadee.scu.common.domain.entity.Singer;
import com.hwadee.scu.common.domain.entity.SingerTotalComment;

import java.util.List;

/**
 * @program: musicPlatform
 * @description:
 * @author: Mr.Like
 * @create: 2021-06-16 18:25
 **/

public interface DataService {
    List<List<Comment>> getComment();
    List<Area> getAreas();
    List<SingerTotalComment> getTotalComment();
}
