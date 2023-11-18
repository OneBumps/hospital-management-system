package com.edu.xhu.pojo.dao.dto;

public class PatientQueryDto extends BasePageDto{
    //医生姓名
    private String doctorNum;
    //患者姓名
    private String name;
    //医生编号
    private String doctorName;

    public String getDoctorNum() {
        return doctorNum;
    }

    public void setDoctorNum(String doctorNum) {
        this.doctorNum = doctorNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

}
