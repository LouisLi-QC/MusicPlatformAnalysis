package com.hwadee.scu.service;

import com.hwadee.scu.common.domain.Admin;
import com.hwadee.scu.common.domain.AdminExample;
import com.hwadee.scu.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: musicPlatform
 * @description:
 * @author: fanyang
 * @create: 2021-06-15 11:25
 **/
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;
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
        return admins.get(0).getEmail().equals(password)?true:false;//比较密码是否相同
    }
}
