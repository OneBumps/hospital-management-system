package com.edu.xhu.controller;

import com.edu.xhu.pojo.dao.dto.ManagementPageDto;
import com.edu.xhu.pojo.entity.Management;
import com.edu.xhu.result.Result;
import com.edu.xhu.service.ManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("management")
@ResponseBody
public class ManagementController {
    @Autowired
    private ManagementService managementService;

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public Result list(ManagementPageDto managementPageDto) {
        List<Management> managementList = managementService.selectAll(managementPageDto);
        Long count = managementService.findCount(managementPageDto);
        return Result.buildSuccess(count, managementList);
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public Result add(Management management) {
        managementService.insert(management);
        return Result.buildSuccess();
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public Result update(Management management) {
        managementService.updateByPrimaryKey(management);
        return Result.buildSuccess();
    }


    @RequestMapping(value = "find", method = RequestMethod.GET)
    public Result find(Long id) {
        Management management = managementService.selectByPrimaryKey(id);
        return Result.buildSuccess(management);
    }

    @RequestMapping(value = "delete", method = RequestMethod.GET)
    public Result delete(Long id) {
        managementService.deleteByPrimaryKey(id);
        return Result.buildSuccess();
    }

    @RequestMapping(value = "enable", method = RequestMethod.GET)
    public Result enable(Long id) {
        Management management = managementService.selectByPrimaryKey(id);
        management.setOpen(management.getOpen() == 1 ? 0 : 1);
        managementService.updateByPrimaryKey(management);
        return Result.buildSuccess();
    }

}