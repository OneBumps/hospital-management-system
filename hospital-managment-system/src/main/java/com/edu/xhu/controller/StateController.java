package com.edu.xhu.controller;



import com.edu.xhu.pojo.dao.dto.StateQueryDto;
import com.edu.xhu.pojo.entity.State;
import com.edu.xhu.result.Result;
import com.edu.xhu.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/state")  //定义访问路径的前缀
@ResponseBody//把对象转换成Json格式返回给前端 这个类下面所有的方法都是返回Json数据
public class StateController {
    @Autowired
    private StateService stateService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public Result list(StateQueryDto stateQueryDto){

        List<State> stateList = stateService.findStateByPage(stateQueryDto);

        Long count=stateService.findStateByPageCount(stateQueryDto);

        return Result.buildSuccess(count,stateList);

    }
    @RequestMapping(value = "/add" ,method = RequestMethod.POST)
    public Result add(State state){
        stateService.insertState(state);

        return Result.buildSuccess();
    }

    @RequestMapping(value = "/find",method = RequestMethod.GET)
    public Result find(Long id){
        State state=stateService.findStateById(id);

        return Result.buildSuccess(state);
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public Result update(State state){
        //处理添加
        stateService.updateState(state);
        //处理返回
        return Result.buildSuccess();
    }

    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public Result delete(Long id){
        stateService.deleteStateById(id);

        //处理返回
        return Result.buildSuccess();
    }
}
