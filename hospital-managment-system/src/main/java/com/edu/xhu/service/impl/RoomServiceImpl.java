package com.edu.xhu.service.impl;


import com.edu.xhu.mapper.RoomMapper;
import com.edu.xhu.pojo.dao.dto.RoomQueryDto;
import com.edu.xhu.pojo.entity.Room;
import com.edu.xhu.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomMapper roomMapper;

    @Override
    public int insertRoom(Room room) {
        return roomMapper.insertRoom(room);
    }

    @Override
    public List<Room> findRoomAll() {
        return roomMapper.findRoomAll();
    }

    @Override
    public Room findRoomById(Long id) {
        return roomMapper.findRoomById(id);
    }

    @Override
    public int deleteRoomById(Long id) {
        return roomMapper.deleteRoomById(id);
    }

    @Override
    public int updateRoomById(Room room) {
        return roomMapper.updateRoomById(room);
    }

    @Override
    public int updateRoomState(Room room) {
        return roomMapper.updateRoomState(room);
    }

    @Override
    public List<Room> findRoomByPage(RoomQueryDto roomQueryDto) {
        return roomMapper.findRoomByPage(roomQueryDto);
    }

    @Override
    public Long findRoomByPageCount(RoomQueryDto roomQueryDto) {
        return roomMapper.findRoomByPageCount(roomQueryDto);
    }
}
