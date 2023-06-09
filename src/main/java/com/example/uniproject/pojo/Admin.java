package com.example.uniproject.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * @TableName admin
 */
@TableName(value ="admin")
@Data
public class Admin implements Serializable {
    private Integer adminId;

    private String adminName;

    private String adminPwd;

    private static final long serialVersionUID = 1L;
}