package com.edu.xhu.controller;
import com.edu.xhu.pojo.dao.dto.InstrumentQueryDto;
import com.edu.xhu.pojo.entity.Instrument;
import com.edu.xhu.result.Result;
import com.edu.xhu.service.InstrumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/instrument")
@ResponseBody //返回josn格式
public class InstrumentController {
    @Autowired
    InstrumentService instrumentService;

    @RequestMapping(value = "/list")
    public Result list(InstrumentQueryDto instrumentQueryDto){
        //查询页面数据
        List<Instrument> instrumentList = instrumentService.findInstrumentByPage(instrumentQueryDto);
        Long count = instrumentService.findInstrumentCount(instrumentQueryDto);
        return Result.buildSuccess(count,instrumentList);
    }

    @RequestMapping("/add")
    public Result add(Instrument instrument){
        instrumentService.insertSelective(instrument);
        return Result.buildSuccess();
    }
    @RequestMapping("/find")
    public Result find(Long id){
        Instrument instrument = instrumentService.selectByPrimaryKey(id);
        return  Result.buildSuccess(instrument);
    }
    @RequestMapping("/update")
    public Result update(Instrument instrument){
        instrumentService.updateByPrimaryKey(instrument);
        return Result.buildSuccess();
    }
    @RequestMapping("/delete")
    public Result delete(Long id){
        instrumentService.deleteByPrimaryKey(id);
        return Result.buildSuccess();
    }
}
