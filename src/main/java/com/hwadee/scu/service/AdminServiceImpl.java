package com.hwadee.scu.service;

import com.hwadee.scu.common.domain.*;
import com.hwadee.scu.mapper.AdminMapper;
import com.hwadee.scu.mapper.CdCommentsMapper;
import com.hwadee.scu.mapper.MusicListMapper;
import com.hwadee.scu.mapper.PlaylistNumberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @program: musicPlatform
 * @description: 管理端的Service
 * @author: fanyang
 * @create: 2021-06-15 11:25
 **/
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;
    @Autowired
    private CdCommentsMapper cdCommentsMapper;
    @Autowired
    private PlaylistNumberMapper playlistNumberMapper;
    @Override
    public boolean register(String Email, String password) {
        Admin admin=new Admin();
        admin.setEmail(Email);
        admin.setPassword(password);
        int res=adminMapper.insertSelective(admin);//插入数据库
        return res>=1?true:false;
    }

    /**
     * create by: fanyang
     * description: 登陆功能
     * params: Email, password
     * return:是否登陆成功，先检查是否有此邮箱，再检查密码是否正确
     * create time:
     */
    @Override
    public boolean login(String Email, String password) {
        AdminExample adminExample=new AdminExample();
        AdminExample.Criteria criteria=adminExample.createCriteria();
        criteria.andEmailEqualTo(Email);
        List<Admin> admins=adminMapper.selectByExample(adminExample);
        if(admins.isEmpty()){//如果admins为空，说明数据库中没有该账号，直接返回失败
            return false;
        }
        return admins.get(0).getPassword().equals(password)?true:false;//比较密码是否相同
    }

    /**
     * create by: fanyang
     * description: 检查用户是否已注册
     * params:Email,用户邮箱
     * return:返回是否已注册，已注册为true，未注册为false
     * create time:
     */
    @Override
    public boolean isExist(String Email) {
        AdminExample adminExample=new AdminExample();
        AdminExample.Criteria criteria=adminExample.createCriteria();
        criteria.andEmailEqualTo(Email);
        long count=adminMapper.countByExample(adminExample);//count大于等于1则已注册，禁止再次注册
        return count>=1?true:false;
    }

    /**
     * create by: fanyang
     * description: 获取所有成都的评论的信息，进行增删改查
     * params:无需参数
     * return:返回所有评论的信息
     * create time:
     */
    @Override
    public List<CdComments> getAllComments() {
        CdCommentsExample cdCommentsExample=new CdCommentsExample();
        CdCommentsExample.Criteria criteria=cdCommentsExample.createCriteria();
        criteria.andIdIsNotNull();
        List<CdComments> comments=cdCommentsMapper.selectByExample(cdCommentsExample);
        return comments;
    }

    /**
     * create by: fanyang
     * description: 添加
     * params:
     * return:
     * create time:
     */
    @Override
    public boolean addComment(String user, String vip, String content) {
        CdComments comments=new CdComments();
        comments.setUser(user);
        comments.setVip(vip);
        comments.setContent(content);
        Date date=new Date();
        comments.setTime(date);
        int res=cdCommentsMapper.insertSelective(comments);
        return res==1?true:false;
    }

    @Override
    public List<PlaylistNumber> getPlayList() {
        PlaylistNumberExample playlistNumberExample=new PlaylistNumberExample();
        PlaylistNumberExample.Criteria criteria=playlistNumberExample.createCriteria();
        criteria.andIdIsNotNull();
        List<PlaylistNumber> lists=playlistNumberMapper.selectByExample(playlistNumberExample);
        return lists;
    }

    @Override
    public boolean addPlayList(String listName, String playNumber) {
        PlaylistNumber playlistNumber=new PlaylistNumber();
        playlistNumber.setListname(listName);
        playlistNumber.setPlaynumber(Integer.valueOf(playNumber));
        int res=playlistNumberMapper.insertSelective(playlistNumber);
        return res==1?true:false;
    }

    /**
     * create by: fanyang
     * description: 删除歌单以及播放量
     * params:
     * return:
     * create time:
     */
    @Override
    public boolean deletePlayList(String id) {
        int res=playlistNumberMapper.deleteByPrimaryKey(Integer.valueOf(id));
        return res==1?true:false;
    }

    @Override
    public boolean changePlayList(String id, String listName, String playNumber) {
        PlaylistNumber playlistNumber=new PlaylistNumber();
        playlistNumber.setId(Integer.valueOf(id));
        playlistNumber.setListname(listName);
        playlistNumber.setPlaynumber(Integer.valueOf(playNumber));
        int res=playlistNumberMapper.updateByPrimaryKeySelective(playlistNumber);
        return res==1?true:false;
    }
}
