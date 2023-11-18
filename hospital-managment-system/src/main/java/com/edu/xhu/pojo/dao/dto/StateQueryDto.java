package com.edu.xhu.pojo.dao.dto;

public class StateQueryDto extends BasePageDto{
    private String name;

    private Integer now;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNow() {
        return now;
    }

    public void setNow(Integer now) {
        this.now = now;
    }
}
