package com.edu.xhu.mapper;


import com.edu.xhu.pojo.dao.dto.RoomQueryDto;
import com.edu.xhu.pojo.entity.Room;

import java.util.List;

public interface RoomMapper {
    /**
     * 插入病房
     * @param room
     * @return
     */
    int insertRoom(Room room);
    /**
     * 查询所有
     * @return
     */
    List<Room> findRoomAll();
    /**
     * 根据id查找病房
     * @param id
     * @return
     */
    Room findRoomById(Long id);
    /**
     * 根据id删除病房
     * @param id
     * @return
     */
    int deleteRoomById(Long id);
    /**
     * 根据id更新病房
     * @param room
     * @return
     */
    int updateRoomById(Room room);
    /**
     * 更改病房状态
     * @param room
     * @return
     */
    int updateRoomState(Room room);
    /**
     * 根据分页查询病房
     * @param roomQueryDto
     * @return
     */
    List<Room> findRoomByPage(RoomQueryDto roomQueryDto);
    /**
     * 分页查询病房数据
     * @param roomQueryDto
     * @return
     */
    Long findRoomByPageCount(RoomQueryDto roomQueryDto);
}
