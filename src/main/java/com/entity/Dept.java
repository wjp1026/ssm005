package com.entity;

import org.springframework.stereotype.Repository;

/**
 * @PACKAGE_NAME: com.entity
 * @Author: 吴金鹏
 * @Date: 2022/11/14 : 13:45
 * @DESCRIPTION ： 描述
 */
@Repository
public class Dept {
    private Integer deptId;
    private String deptName;

    @Override
    public String toString() {
        return "Dept{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                '}';
    }

    public Dept(Integer deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }

    public Dept() {
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
