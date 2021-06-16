package com.hwadee.scu.controller;

import com.hwadee.scu.common.domain.entity.SongAndSinger;
import com.hwadee.scu.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/charts")
public class MusicController {
    @Autowired
    private MusicService musicService;

    @RequestMapping("/songAndsinger")
    @ResponseBody
    public SongAndSinger songAndsinger(){
        return musicService.getSongAndSinger();
    }
}
