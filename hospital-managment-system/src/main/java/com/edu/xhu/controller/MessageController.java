package com.edu.xhu.controller;


import com.edu.xhu.pojo.dao.dto.MessageQueryDto;
import com.edu.xhu.pojo.entity.Message;
import com.edu.xhu.result.Result;
import com.edu.xhu.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/message")  //定义访问路径的前缀
@ResponseBody//把对象转换成Json格式返回给前端 这个类下面所有的方法都是返回Json数据
public class MessageController {
    @Autowired
    private MessageService messageService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)

    public Result list(MessageQueryDto messageQueryDto){
        List<Message> patientList=messageService.findMessageByPage(messageQueryDto);

        Long count=messageService.findMessageByPageCount(messageQueryDto);

        return Result.buildSuccess(count,patientList);
    }

    @RequestMapping(value = "/add" ,method = RequestMethod.POST)
    public Result add(Message message){
        messageService.insertMessage(message);

        return Result.buildSuccess();
    }

    @RequestMapping(value = "/find",method = RequestMethod.GET)
    public Result find(Long id){
        Message message=messageService.findMessageById(id);

        return Result.buildSuccess(message);
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public Result update(Message message){
        //处理添加
        messageService.updateMessage(message);
        //处理返回
        return Result.buildSuccess();
    }

    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public Result delete(Long id){
        messageService.deleteMessageById(id);

        //处理返回
        return Result.buildSuccess();
    }

    @RequestMapping(value = "/deleteAll",method = RequestMethod.GET)
    public Result deleteAll(String ids){

        String[] arr = ids.split(",");
        List<String> list = Arrays.asList(arr);
        for (String item : list) {
            messageService.deleteMessageById(Long.parseLong(item));
        }
        //处理返回
        return Result.buildSuccess();
    }
}
