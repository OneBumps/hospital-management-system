package com.edu.xhu.test.zhyTest;

import com.edu.xhu.pojo.dao.dto.PatientQueryDto;
import com.edu.xhu.service.PatientService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/applicationContext.xml")
public class testPatientService {
    @Autowired
    private PatientService patientService;

    @Test
    public void findAll(){

        System.out.println(patientService.findAll());
    }
    @Test
    public void findMessage(){
        PatientQueryDto patientQueryDto=new PatientQueryDto();

//        patientQueryDto.setName("李四");
//        patientQueryDto.setDoctorNum("D005");
        patientQueryDto.setDoctorName("华");

        System.out.println(patientService.findPatientByPage(patientQueryDto));

        System.out.println(patientService.findPatientByPageCount(patientQueryDto));
    }
}
