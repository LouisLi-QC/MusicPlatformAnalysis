package com.hwadee.scu.service;

import com.hwadee.scu.common.domain.entity.Comments;

import java.util.List;

public interface CommentsService {
    //获取每首歌各个时段的评论数
    Comments getCommentsByTime();


}
