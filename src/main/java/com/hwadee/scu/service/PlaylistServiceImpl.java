package com.hwadee.scu.service;

import com.hwadee.scu.common.domain.PlaylistNumber;
import com.hwadee.scu.common.domain.entity.PlayList;
import com.hwadee.scu.mapper.MusicListMapper;
import com.hwadee.scu.mapper.PlaylistNumberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaylistServiceImpl implements PlaylistService {
    @Autowired
    private PlaylistNumberMapper playlistNumberMapper;
    @Autowired
    private MusicListMapper musicListMapper;

    @Override
    public List<PlaylistNumber> selectPlayNumber() {
        return playlistNumberMapper.selectPlayNumber();
    }

    @Override
    public List<PlayList> selectListSong() {
        return musicListMapper.selectListSong();
    }
}
