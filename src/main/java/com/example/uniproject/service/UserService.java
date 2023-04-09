package com.example.uniproject.service;

import com.example.uniproject.pojo.User;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.beans.factory.annotation.Autowired;

/**
* @author 13016
* @description 针对表【user】的数据库操作Service
* @createDate 2023-04-08 14:20:15
*/
public interface UserService extends IService<User> {
   @Autowired
    public boolean save(User user);
    public boolean searchUser(String userTel);
    public boolean authUser(String userTel,String userPwd);
}
