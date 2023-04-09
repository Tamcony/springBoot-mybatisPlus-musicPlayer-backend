package com.example.uniproject.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.uniproject.pojo.Admin;
import com.example.uniproject.service.AdminService;
import com.example.uniproject.mapper.AdminMapper;
import org.springframework.stereotype.Service;

/**
* @author 13016
* @description 针对表【admin】的数据库操作Service实现
* @createDate 2023-04-08 14:10:40
*/
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin>
implements AdminService{

}




