package com.edu.xhu.controller;



import com.edu.xhu.pojo.dao.dto.BedQueryDto;
import com.edu.xhu.pojo.entity.Bed;
import com.edu.xhu.result.Result;
import com.edu.xhu.service.BedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by zxd on 2023/11/4
 */
@Controller
@RequestMapping("/bed")//定义访问路径的前缀
@ResponseBody//把对象转换成json格式返回给前端  这个类下面所有的方法都是返回json数据
public class BedController {

    @Autowired
    private BedService bedService;

    @RequestMapping(value = "/list1",method = RequestMethod.GET)//定义访问的访问路径  method限制请求方式
    public Result list(){
        List<Bed> bedList = bedService.findBedAll();
        return Result.buildSuccess(100L,bedList);
    }


    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Result add(Bed bed){//1.接收参数
        bedService.insertBed(bed);
        return Result.buildSuccess();
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public Result update(Bed bed){
        bedService.updateBedById(bed);
        return Result.buildSuccess();
    }


    @RequestMapping(value = "/find",method = RequestMethod.GET)
    public Result find(Long id){
        Bed bed = bedService.findBedById(id);
        return Result.buildSuccess(bed);
    }

    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public Result delete(Long id){
        bedService.deleteBedById(id);
        return Result.buildSuccess();
    }

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public Result list1(BedQueryDto bedQueryDto){
        //查询页面数据
        List<Bed> bedList=bedService.findBedByPage(bedQueryDto);

        //查询总记录
        Long count = bedService.findBedByPageCount(bedQueryDto);

        return Result.buildSuccess(count,bedList);
    }
}
