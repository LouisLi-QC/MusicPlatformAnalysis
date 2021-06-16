package com.hwadee.scu.controller;

import com.hwadee.scu.common.domain.entity.Comments;
import com.hwadee.scu.service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/charts")
public class CommentsController {
    @Autowired
    private CommentsService commentsService;

    @RequestMapping("/comments")
    @ResponseBody
    public Comments comments(){
        return commentsService.getCommentsByTime();
    }
}
