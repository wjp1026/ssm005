package com.service;

import com.entity.Emp;

import java.util.List;

/**
 * @PACKAGE_NAME: com.service
 * @Author: 吴金鹏
 * @Date: 2022/11/14 : 13:55
 * @DESCRIPTION ： 描述
 */
public interface EmpService {
    //查询全部
    List<Emp> selectAll();
}
