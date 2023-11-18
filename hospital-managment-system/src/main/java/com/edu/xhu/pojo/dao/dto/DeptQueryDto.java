package com.edu.xhu.pojo.dao.dto;

import com.edu.xhu.pojo.dao.dto.BasePageDto;

public class DeptQueryDto extends BasePageDto {

    //部门编号
    private String departmentNumber;

    //部门名称
    private String departmentName;


    public String getDepartmentNum() {
        return departmentNumber;
    }

    public void setDepartmentNum(String departmentNum) {
        this.departmentNumber = departmentNum;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}