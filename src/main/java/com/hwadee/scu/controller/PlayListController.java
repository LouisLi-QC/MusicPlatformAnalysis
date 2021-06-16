package com.hwadee.scu.controller;

import com.hwadee.scu.common.domain.entity.PlayNumAndSongNum;
import com.hwadee.scu.service.PlayListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/charts")
public class PlayListController {
    @Autowired
    private PlayListService playListService;

    @RequestMapping("/playList")
    @ResponseBody
    public PlayNumAndSongNum playNumAndSongNum(){
        return playListService.getPlayList();
    }

}
