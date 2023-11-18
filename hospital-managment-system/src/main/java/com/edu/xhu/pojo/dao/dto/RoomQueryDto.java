package com.edu.xhu.pojo.dao.dto;

import com.edu.xhu.pojo.dao.dto.BedQueryDto;

public class RoomQueryDto extends BedQueryDto {
    //病房号
    private String roomNumber;
    //病房名
    private String roomName;
    //病房状态
    private String roomState;

    @Override
    public String getRoomNumber() {
        return roomNumber;
    }

    @Override
    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomState() {
        return roomState;
    }

    public void setRoomState(String roomState) {
        this.roomState = roomState;
    }
}
