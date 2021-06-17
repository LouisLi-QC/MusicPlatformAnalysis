package com.hwadee.scu.service;

import com.hwadee.scu.common.domain.entity.Singer;
import com.hwadee.scu.common.domain.entity.Song;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SongSingerService {
    String getSongSinger();
}
