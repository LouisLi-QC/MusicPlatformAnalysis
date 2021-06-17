package com.hwadee.scu.controller;


import com.hwadee.scu.service.SongSingerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/charts")
public class SongAndSingerController {
    @Autowired
    private SongSingerService songSingerService;

    @RequestMapping("/SongAndSinger")
    @ResponseBody
    public String getSongSinger(){
        return songSingerService.getSongSinger();
    }
}
