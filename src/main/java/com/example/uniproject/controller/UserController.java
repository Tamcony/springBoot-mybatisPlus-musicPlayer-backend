package com.example.uniproject.controller;

import com.example.uniproject.pojo.User;
import com.example.uniproject.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    public UserServiceImpl userService;
    @RequestMapping("/sign-up")
    public Map<String,Object> createUser(@RequestBody User user){
        Map<String,Object> map = new HashMap<>();
        if(!userService.searchUser(user.getUserTel())){
            map.put("msg","该用户已存在，请登录");
            map.put("success",false);
            return map;
        }
        if(!userService.save(user)){
            map.put("msg","创建失败");
            map.put("success",false);
            return map;
        }
        map.put("msg","创建成功");
        map.put("success",true);
        return map;
    }

    @RequestMapping("/auth")
    public  Map<String,Object> searchUserByTel(@RequestBody User user){
        System.out.println("登录接口测试");
        Map<String,Object> map = new HashMap<>();
        if(userService.searchUser(user.getUserTel())){
            System.out.println("该用户不存在，请注册");
            map.put("msg","该用户不存在，请注册");
            map.put("success",false);
            return map;
        }
        if(!userService.authUser(user.getUserTel(),user.getUserPwd())){
            System.out.println("手机号或密码错误");
            map.put("msg","手机号或密码错误");
            map.put("success",false);
            return map;
        }
        map.put("msg","登录成功");
        map.put("success",true);
        return map;
    }
}
