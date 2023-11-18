package com.edu.xhu.pojo.entity;

import java.io.Serializable;
import java.util.Date;

public class Bed implements Serializable {
    private Long id;

    //病床号
    private String bedNumber;

    //房间号
    private String roomNumber;
    private Date putDate;

    //病床状态
    private String bedState;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBedNumber() {
        return bedNumber;
    }

    public void setBedNumber(String bedNumber) {
        this.bedNumber = bedNumber;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getBedState() {
        return bedState;
    }

    public void setBedState(String bedState) {
        this.bedState = bedState;
    }

    public Date getPutDate() {
        return putDate;
    }

    public void setPutDate(Date putDate) {
        this.putDate = putDate;
    }

    @Override
    public String toString() {
        return "Bed{" + "id=" + id + ", bedNumber='" + bedNumber + '\'' + ", roomNumber='" + roomNumber + '\'' + ", putDate=" + putDate + ", bedState='" + bedState + '\'' + '}';
    }
}