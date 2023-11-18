package com.edu.xhu.controller;

import com.edu.xhu.pojo.dao.dto.medicinedto;
import com.edu.xhu.pojo.entity.Medicine;
import com.edu.xhu.service.MedicineService;
import com.edu.xhu.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/medicine")
@ResponseBody
public class MedicineController {
    @Autowired
    private MedicineService medicineService;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Result add(Medicine medicine){
        medicineService.insertMedicine(medicine);
       return Result.buildSuccess();
    }
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Result update(Medicine medicine) {
        medicineService.updateMedicine(medicine);
        return Result.buildSuccess();
    }
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public Result delete(Long id){
        medicineService.deleteMedicineById(id);
        return Result.buildSuccess();
    }
    @RequestMapping(value = "/find", method = RequestMethod.GET)
    public Result find(Long id) {
       Medicine line = medicineService.findMedicineById(id);
        return Result.buildSuccess(line);
    }
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public Result list(medicinedto medicinedto){
        List<Medicine> medicineList = medicineService.findmedicineByPage(medicinedto);
        Long count = medicineService.findmedicineByPageCount(medicinedto);
        return Result.buildSuccess(count,medicineList);

    }
}
