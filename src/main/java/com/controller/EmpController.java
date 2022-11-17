package com.controller;

import com.entity.Emp;
import com.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @PACKAGE_NAME: com.controller
 * @Author: 吴金鹏
 * @Date: 2022/11/14 : 13:48
 * @DESCRIPTION ： 描述
 */
@RestController
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    private EmpService empService;

    public EmpController() {
        System.out.println("加载到了");
    }

    @RequestMapping("/selectAll")
    public List<Emp> selectAll(){
        List<Emp> list = empService.selectAll();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        return list;
    }


}
