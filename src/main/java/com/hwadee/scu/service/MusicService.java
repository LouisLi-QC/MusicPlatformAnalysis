package com.hwadee.scu.service;

import com.hwadee.scu.common.domain.entity.Singer;
import com.hwadee.scu.common.domain.entity.Song;
import com.hwadee.scu.common.domain.entity.SongAndSinger;

public interface MusicService {
    //获取歌单出现次数排名前十的歌曲和歌手
    SongAndSinger getSongAndSinger();

    //获取歌单出现次数排名前十的歌曲
    Song[] getSong();

    //获取歌单出现次数排名前十的歌手
    Singer[] getSinger();
}
