package com.example.uniproject.mapper;

import com.example.uniproject.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 13016
* @description 针对表【user】的数据库操作Mapper
* @createDate 2023-04-08 14:20:15
* @Entity generator.pojo.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {
    boolean save(User user);
    User selectByUserTel(String userTel);
}




