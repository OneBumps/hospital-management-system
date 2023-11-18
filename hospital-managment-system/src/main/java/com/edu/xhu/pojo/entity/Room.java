package com.edu.xhu.pojo.entity;

import java.io.Serializable;
import java.util.Date;

public class Room implements Serializable {
    private Long id;
    //病房号
    private String roomNumber;
    //病房名
    private String roomName;
    //所属大楼
    private String buildName;
    //所属楼层
    private String floor;
    //病房状态
    private String roomState;
    //备注
    private String notes;
    //操作时间
    private Date putDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getBuildName() {
        return buildName;
    }

    public void setBuildName(String buildName) {
        this.buildName = buildName;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getRoomState() {
        return roomState;
    }

    public void setRoomState(String roomState) {
        this.roomState = roomState;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Date getPutDate() {
        return putDate;
    }

    public void setPutDate(Date putDate) {
        this.putDate = putDate;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", roomNumber='" + roomNumber + '\'' +
                ", roomName='" + roomName + '\'' +
                ", buildName='" + buildName + '\'' +
                ", floor='" + floor + '\'' +
                ", roomState='" + roomState + '\'' +
                ", notes='" + notes + '\'' +
                ", putDate=" + putDate +
                '}';
    }
}
