package com.service;

import com.entity.Emp;
import com.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @PACKAGE_NAME: com.service
 * @Author: 吴金鹏
 * @Date: 2022/11/14 : 13:56
 * @DESCRIPTION ： 描述
 */
@Service
public class EmpServiceImpl implements EmpService{

    @Autowired
    private EmpMapper empMapper;
    /*public void setEmpMapper(EmpMapper empMapper) {
        this.empMapper = empMapper;
    }*/

    @Override
    public List<Emp> selectAll() {
        List<Emp> list = null;
        list = empMapper.selectAll();
        return list;
    }
}
