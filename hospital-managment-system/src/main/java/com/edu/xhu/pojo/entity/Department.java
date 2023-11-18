package com.edu.xhu.pojo.entity;

import java.io.Serializable;

/**
 * @TableName department
 */
public class Department implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String departmentNum;
    private String departmentName;
    private String location;
    private String phoneNumber;
    private String email;
    private String openingHours;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentNum() {
        return departmentNum;
    }

    public void setDepartmentNum(String departmentNum) {
        this.departmentNum = departmentNum;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }

    @Override
    public String toString() {
        return "Department{" + "id=" + id + ", departmentNum='" + departmentNum + '\'' + ", departmentName='" + departmentName + '\'' + ", location='" + location + '\'' + ", phoneNumber='" + phoneNumber + '\'' + ", email='" + email + '\'' + ", openingHours='" + openingHours + '\'' + '}';
    }
}