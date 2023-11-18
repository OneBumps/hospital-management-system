package com.edu.xhu.controller;


import com.edu.xhu.pojo.dao.dto.PatientQueryDto;
import com.edu.xhu.pojo.entity.Patient;
import com.edu.xhu.result.Result;
import com.edu.xhu.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/patient")  //定义访问路径的前缀
@ResponseBody//把对象转换成Json格式返回给前端 这个类下面所有的方法都是返回Json数据
public class PatientController {
    @Autowired
    private PatientService patientService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)

    public Result list(PatientQueryDto patientQueryDto){
        //查询页面数据
        List<Patient> patientList=patientService.findPatientByPage(patientQueryDto);

        //查询页面总数
        Long count=patientService.findPatientByPageCount(patientQueryDto);

        return Result.buildSuccess(count,patientList);
    }

    @RequestMapping(value = "/add" ,method = RequestMethod.POST)
    public Result add(Patient patient){
        patientService.insertPatient(patient);

        return Result.buildSuccess();
    }

    @RequestMapping(value = "/find",method = RequestMethod.GET)
    public Result find(Long id){
        Patient patient =patientService.findPatientById(id);

        return Result.buildSuccess(patient);
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public Result update(Patient patient){
        //处理添加
        patientService.updatePatient(patient);
        //处理返回
        return Result.buildSuccess();
    }

    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public Result delete(Long id){
        patientService.deletePatientById(id);

        //处理返回
        return Result.buildSuccess();
    }
}
