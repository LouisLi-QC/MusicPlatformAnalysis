package com.hwadee.scu.service;

import com.hwadee.scu.common.domain.entity.Comments;

public interface CommentsService {
    //获取每首歌各个时段的评论数
    Comments getCommentsByTime();
}
