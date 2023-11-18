package com.edu.xhu.pojo.entity;

import java.util.Date;

public class Patient {
    private Long id;
    //病人姓名
    private String name;
    //入院时间
    private Date time;
    //所属科室
    private String office;
    //状况
    private String conditions;
    //主治医师
    private String doctorNum;
    //医生姓名
    private String doctorName;
    //房间号
    private String room;
    //床位号
    private String bed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    public String getDoctorNum() {
        return doctorNum;
    }

    public void setDoctorNum(String doctorNum) {
        this.doctorNum = doctorNum;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getBed() {
        return bed;
    }

    public void setBed(String bed) {
        this.bed = bed;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", time=" + time +
                ", office='" + office + '\'' +
                ", conditions='" + conditions + '\'' +
                ", doctorNum='" + doctorNum + '\'' +
                ", doctorName='" + doctorName + '\'' +
                ", room='" + room + '\'' +
                ", bed='" + bed + '\'' +
                '}';
    }
}
