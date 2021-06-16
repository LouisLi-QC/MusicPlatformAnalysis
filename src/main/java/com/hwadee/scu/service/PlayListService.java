package com.hwadee.scu.service;

import com.hwadee.scu.common.domain.entity.PlayNum;
import com.hwadee.scu.common.domain.entity.PlayNumAndSongNum;
import com.hwadee.scu.common.domain.entity.SongNum;

public interface PlayListService {
    //获取播放量前十的歌单和包含曲目前十的歌单
    PlayNumAndSongNum getPlayList();

    //获取播放量前十的歌单
    PlayNum[] getPlayNum();

    //获取包含曲目前十的歌单
    SongNum[] getSongNum();

}
