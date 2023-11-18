package com.edu.xhu.pojo.dao.dto;


public class BedQueryDto extends BasePageDto {
    private String bedNumber;
    private String roomNumber;
    private Integer bedState;

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

    public Integer getBedState() {
        return bedState;
    }

    public void setBedState(Integer bedState) {
        this.bedState = bedState;
    }
}