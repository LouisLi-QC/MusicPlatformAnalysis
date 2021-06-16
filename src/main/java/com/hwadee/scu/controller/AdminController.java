package com.hwadee.scu.controller;

import com.hwadee.scu.common.domain.CdComments;
import com.hwadee.scu.common.domain.MusicList;
import com.hwadee.scu.common.domain.PlaylistNumber;
import com.hwadee.scu.common.util.MD5;
import com.hwadee.scu.common.util.Response;
import com.hwadee.scu.common.util.StringRedisUtils;
import com.hwadee.scu.service.EmailService;
import com.hwadee.scu.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * create by: fanyang
 * description: 前端登陆的controller
 * create time:
 */
@RestController
@CrossOrigin
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private StringRedisUtils stringRedisUtils;
    @Autowired
    static JavaMailSender javaMailSender;
    @Autowired
    EmailService emailService;
    @Autowired
    MD5 md5;
    @Autowired
    AdminService adminService;
    /**
     * create by: fanyang
     * description:
     * params:phoneNumber为用户手机号，code为系统生成的验证码
     * return:返回true代表发送成功,false代表发送失败
     * create time:
     */
    @RequestMapping("/sendCode")
    public Response sendCode(String Email,String code){
        System.out.println(Email);
        System.out.println(code);
        boolean sendFlag=emailService.sendEmail(Email,code);//发送验证码
        boolean expireFlag=stringRedisUtils.expire(Email,code,15*60);//将验证码存入redis并设置过期时间
        if(sendFlag&&expireFlag){
            return new Response(true,"验证码发送成功");
        }
        return new Response(false,"验证码发送失败");
    }

    /**
     * create by: fanyang
     * description: 用户注册
     * params:Email为邮箱，password为密码，userCode为用户输入的验证码
     * return:410代表验证码过期，200代码注册成功
     * create time:
     */
    @RequestMapping("/register")
    public Response register(String Email, String password, String userCode){
        String pwd=md5.getMD5(password);//加密后的密码
        String realCode=stringRedisUtils.get(Email);//从redis中读取验证码
        //如果用户输入的验证码和系统生成的验证码一致，则成功注册
        if(realCode==null){
            return new Response(false,410,"验证码已过期");
        }
        if(realCode.equals(userCode)){
            boolean flag=adminService.register(Email,pwd);
            return flag?new Response(true,200,"注册成功"):new Response(false,412,"未知的错误，请重试");
        }

        return new Response(false,411,"验证码错误，注册失败");
    }

    /**
     * create by: fanyang
     * description:
     * params:
     * return:
     * create time:
     */
    @RequestMapping("/login")
    public Response login(String Email,String password){
        System.out.println(Email);
        System.out.println(password);
        String pwd=md5.getMD5(password);//加密后的密码
        boolean loginFlag=adminService.login(Email,pwd);
        return loginFlag?new Response(true,200,"登陆成功"):new Response(false,411,"密码错误");
    }
    /**
     * create by: fanyang
     * description: 获取所有的成都的评论
     * params:无
     * return:
     * create time:
     */
    @RequestMapping("/comments")
    public List<CdComments> getCdComments(){
        List<CdComments> comments=adminService.getAllComments();
        return  comments;
    }
    /**
     * create by: fanyang
     * description: 添加评论
     * params:user用户名，time日期，vip会员，content评论内容
     * return:是否添加成功
     * create time:
     */
    @RequestMapping("/addComment")
    public Response addCdComment(String user,String time,String vip,String content){
        System.out.println(user);
        boolean flag=adminService.addComment(user,vip,content);
        if(flag)
        {
            return new Response(true,200,"添加成功");
        }
        return new Response(true,411,"添加失败");

    }
    /**
     * create by: fanyang
     * description: 获得歌单以及对应的播放量
     * params:无
     * return:返回歌单表
     * create time:
     */
    @RequestMapping("/getPlayLists")
    public List<PlaylistNumber> getMusicList(){
        List<PlaylistNumber> musicLists=adminService.getPlayList();
        return musicLists;
    }
    /**
     * create by: fanyang
     * description: 添加歌单以及对应的歌单播放量
     * params:歌单名和播放量
     * return:返回是否添加成功
     * create time:
     */
    @RequestMapping("/addPlayList")
    public Response addMusicList(String listName,String playNumber){
        Boolean flag=adminService.addPlayList(listName,playNumber);
        if(flag)
        {
            return new Response(true,200,"添加成功");
        }
        return new Response(true,411,"添加失败");
    }

    /**
     * create by: fanyang
     * description:
     * params:
     * return:
     * create time:
     */
    @RequestMapping("/deletePlayList")
    public Response deletePlayList(String id){
        Boolean flag=adminService.deletePlayList(id);
        return flag? new Response(true,200,"删除成功"):new Response(false,411,"删除失败");
    }


    /**
     * create by: fanyang
     * description:
     * params:
     * return:
     * create time:
     */
    @RequestMapping("/changePlayList")
    public Response changePlayList(String id,String listName,String playNumber){
        System.out.println(id);
        System.out.println(listName);
        System.out.println(playNumber);
        Boolean flag=adminService.changePlayList(id,listName,playNumber);
        return flag? new Response(true,200,"更改成功"):new Response(false,411,"更改失败");
    }





}
