package com.onebumps.controller;

import com.onebumps.pojo.entity.Doctor;
import com.onebumps.result.Result;
import com.onebumps.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("doctor")
@ResponseBody
public class DoctorController {
    @Autowired
    private DoctorService doctorService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public Result list() {
        List<Doctor> lineList = doctorService.findDoctorAll();
        return Result.buildSuccess(100L, lineList);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Result add(Doctor line) {//1.接收参数
        doctorService.insertDoctor(line);
        return Result.buildSuccess();
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Result update(Doctor line) {
        doctorService.updateDoctor(line);
        return Result.buildSuccess();
    }


    @RequestMapping(value = "/find", method = RequestMethod.GET)
    public Result find(Long id) {
        Doctor line = doctorService.findDoctorById(id);
        return Result.buildSuccess(line);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public Result delete(Long id) {
        doctorService.deleteDoctorById(id);
        return Result.buildSuccess();
    }
}