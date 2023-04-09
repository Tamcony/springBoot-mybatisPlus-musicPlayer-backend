package com.example.uniproject.mapper;

import com.example.uniproject.pojo.Admin;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 13016
* @description 针对表【admin】的数据库操作Mapper
* @createDate 2023-04-08 14:10:40
* @Entity generator.pojo.Admin
*/
@Mapper
public interface AdminMapper extends BaseMapper<Admin> {
    int searchAllByAdminId();
    @Override
    int insert(Admin entity);
}




