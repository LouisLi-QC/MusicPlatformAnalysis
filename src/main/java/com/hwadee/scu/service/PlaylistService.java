package com.hwadee.scu.service;

import com.hwadee.scu.common.domain.PlaylistNumber;
import com.hwadee.scu.common.domain.entity.PlayList;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PlaylistService {
    List<PlaylistNumber> selectPlayNumber();
    List<PlayList> selectListSong();
}
