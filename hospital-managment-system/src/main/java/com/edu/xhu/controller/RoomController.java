package com.edu.xhu.controller;



import com.edu.xhu.pojo.dao.dto.RoomQueryDto;
import com.edu.xhu.pojo.entity.Room;
import com.edu.xhu.result.Result;
import com.edu.xhu.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/room")
@ResponseBody
public class RoomController {

    @Autowired
    private RoomService roomService;

    @RequestMapping(value = "/list1",method = RequestMethod.GET)
    public Result list(){
        List<Room> roomList=roomService.findRoomAll();
        return Result.buildSuccess(100l,roomList);
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Result add(Room room){
        roomService.insertRoom(room);
        return Result.buildSuccess();
    }
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public Result update(Room room){
        roomService.updateRoomById(room);
        return  Result.buildSuccess();
    }
    @RequestMapping(value = "/find",method = RequestMethod.GET)
    public Result find(Long id){
        Room room=roomService.findRoomById(id);
        return Result.buildSuccess(room);
    }
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public Result delete(Long id){
        roomService.deleteRoomById(id);
        return Result.buildSuccess();
    }
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public Result list(RoomQueryDto roomQueryDto){
        //查询分页数据
        List<Room> roomList=roomService.findRoomByPage(roomQueryDto);
        //查询分页总数
        Long count=roomService.findRoomByPageCount(roomQueryDto);
        return Result.buildSuccess(count,roomList);
    }
}
