package com.edu.xhu.pojo.dao.dto;

public class MessageQueryDto extends BasePageDto{
    //患者姓名
    private String name;
    //电话号
    private String phoneNum;
    //身份证
    private String idNum;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }
}
