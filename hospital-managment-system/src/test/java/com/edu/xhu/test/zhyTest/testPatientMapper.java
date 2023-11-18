package com.edu.xhu.test.zhyTest;

import com.edu.xhu.mapper.PatientMapper;
import com.edu.xhu.pojo.dao.dto.PatientQueryDto;
import com.edu.xhu.pojo.entity.Patient;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/applicationContext-dao.xml")
public class testPatientMapper {
    @Autowired
    private PatientMapper patientMapper;
    @Test
    public void insertPatient(){
        Patient patient=new Patient();

        for(int i=1;i<=100;i++){

            patient.setBed("P004"+i);
            patient.setConditions("肺炎");
            patient.setDoctorName("王雄");
            patient.setName("李四"+i);
            patient.setOffice("胸内科");
            patient.setDoctorNum("D011");
            patient.setRoom("01-202");
            patient.setTime(new Date());

            patientMapper.insertPatient(patient);
        }

    }
    @Test
    public void findAll(){

        List<Patient> patientList=patientMapper.findAll();
        System.out.println(patientList);
    }
    @Test
    public void deleteById(){
        patientMapper.deletePatientById(1L);
    }
    @Test
    public void findById(){

        System.out.println(patientMapper.findPatientById(2L));
    }

    @Test
    public void updatePatient(){
        Patient patient=new Patient();

        patient.setId(1L);
        patient.setBed("P011");
        patient.setConditions("癌症");
        patient.setDoctorName("王雄");
        patient.setName("李青");
        patient.setOffice("细胞科");
        patient.setDoctorNum("D005");
        patient.setRoom("01-111");
        patient.setTime(new Date());

        patientMapper.updatePatient(patient);
    }

    @Test
    public void testFind(){
        PatientQueryDto patientQueryDto=new PatientQueryDto();

//        patientQueryDto.setName("李四");
//        patientQueryDto.setDoctorNum("D005");
        patientQueryDto.setDoctorName("华");

        System.out.println(patientMapper.findPatientByPage(patientQueryDto));

        System.out.println(patientMapper.findPatientByPageCount(patientQueryDto));
    }

}
