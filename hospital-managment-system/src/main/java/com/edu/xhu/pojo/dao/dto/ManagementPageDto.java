package com.edu.xhu.pojo.dao.dto;

public class ManagementPageDto extends BasePageDto {
    private String name;
    private Integer grade;
    private Integer open;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getOpen() {
        return open;
    }

    public void setOpen(Integer open) {
        this.open = open;
    }
}