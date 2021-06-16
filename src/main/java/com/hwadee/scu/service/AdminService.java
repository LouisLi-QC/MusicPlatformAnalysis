package com.hwadee.scu.service;

import com.hwadee.scu.common.domain.CdComments;
import com.hwadee.scu.common.domain.MusicList;
import com.hwadee.scu.common.domain.PlaylistNumber;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: musicPlatform
 * @description:
 * @author: fanyang
 * @create: 2021-06-15 11:25
 **/

public interface AdminService {
    boolean register(String Email,String password);//是否注册成功

    boolean login(String Email,String password);//验证邮箱和密码，验证是否登陆成功

    List<CdComments> getAllComments();//获得所有的成都的用户评论

    boolean addComment(String user,String vip,String content);//添加评论

    List<PlaylistNumber> getPlayList();//获得所有的歌单信息

    boolean addPlayList(String listName,String playNumber);

    boolean deletePlayList(String id);

    boolean changePlayList(String id,String listName,String playNuber);
}
