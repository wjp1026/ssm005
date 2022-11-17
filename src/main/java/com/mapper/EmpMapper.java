package com.mapper;

import com.entity.Emp;

import java.util.List;

/**
 * @PACKAGE_NAME: com.mapper
 * @Author: 吴金鹏
 * @Date: 2022/11/14 : 13:50
 * @DESCRIPTION ： 描述
 */
public interface EmpMapper {
    //查询全部
    List<Emp> selectAll();
}
