package com.example.uniproject.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.uniproject.mapper.UserMapper;
import com.example.uniproject.pojo.User;
import com.example.uniproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author 13016
* @description 针对表【user】的数据库操作Service实现
* @createDate 2023-04-08 14:20:15
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public boolean save(User user) {
        return userMapper.save(user);
    }
    @Override
    public boolean searchUser(String userTel){
        return userMapper.selectByUserTel(userTel)==null;
    }

    @Override
    public boolean authUser(String userTel,String userPwd) {
        System.out.println("数据库密码"+userMapper.selectByUserTel(userTel).getUserPwd());
        System.out.println("实际密码"+userPwd);
        System.out.println(userMapper.selectByUserTel(userTel).getUserPwd().equals(userPwd));
        return userMapper.selectByUserTel(userTel).getUserPwd().equals(userPwd);
    }
}




