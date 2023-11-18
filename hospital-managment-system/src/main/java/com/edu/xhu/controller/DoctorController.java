package com.edu.xhu.controller;

import com.edu.xhu.pojo.dao.dto.DoctorQueryDto;
import com.edu.xhu.pojo.entity.Doctor;
import com.edu.xhu.result.Result;
import com.edu.xhu.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("doctor")
@ResponseBody
public class DoctorController {
    @Autowired
    private DoctorService doctorService;

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public Result list(DoctorQueryDto doctorQueryDto) {
        List<Doctor> doctorList = doctorService.findDoctorAll(doctorQueryDto);
        Long count = doctorService.findDoctorCount(doctorQueryDto);
        return Result.buildSuccess(count, doctorList);
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public Result add(Doctor line) {
        doctorService.insertDoctor(line);
        return Result.buildSuccess();
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public Result update(Doctor doctor) {
        doctorService.updateDoctor(doctor);
        return Result.buildSuccess();
    }


    @RequestMapping(value = "find", method = RequestMethod.GET)
    public Result find(Long id) {
        Doctor line = doctorService.findDoctorById(id);
        return Result.buildSuccess(line);
    }

    @RequestMapping(value = "delete", method = RequestMethod.GET)
    public Result delete(Long id) {
        doctorService.deleteDoctorById(id);
        return Result.buildSuccess();
    }

    @RequestMapping(value = "deleteSelected", method = RequestMethod.GET)
    public Result deleteSelected(String ids) {
        //处理成Long类型的数组
        String[] idArray = ids.split(",");
        Long[] idLongArray = new Long[idArray.length];
        for (int i = 0; i < idArray.length; i++) {
            idLongArray[i] = Long.parseLong(idArray[i]);
        }
        doctorService.deleteDoctorByIds(idLongArray);
        return Result.buildSuccess();
    }
}