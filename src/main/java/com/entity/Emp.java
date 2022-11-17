package com.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Repository;

import java.util.Date;

/**
 * @PACKAGE_NAME: com.entity
 * @Author: 吴金鹏
 * @Date: 2022/11/14 : 13:41
 * @DESCRIPTION ： 描述
 */
@Repository
public class Emp {
    private Integer empId;
    private String empName;
    private Integer deptId;
    @JsonFormat(pattern = "yyyy-MM-dd HH-mm-ss", timezone = "GMT+8")//设置发送的格式 参数2是时区+8
    @DateTimeFormat(pattern = "yyyy-MM-dd HH-mm-ss")//设置接收的格式
    private Date entryDate;

    @Override
    public String toString() {
        return "Emp{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", deptId=" + deptId +
                ", entryDate=" + entryDate +
                '}';
    }

    public Emp(Integer empId, String empName, Integer deptId, Date entryDate) {
        this.empId = empId;
        this.empName = empName;
        this.deptId = deptId;
        this.entryDate = entryDate;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Emp() {
    }

}
