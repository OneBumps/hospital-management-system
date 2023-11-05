package com.onebumps;

import com.onebumps.pojo.entity.Doctor;
import com.onebumps.service.DoctorService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/applicationContext.xml")
public class DoctorServiceTest {
    @Autowired
    private DoctorService doctorService;

    private Doctor doctor;

    @Test
    public void testInsert() {
        doctor = new Doctor();
        doctor.setDoctorNumber("XW04401");
        doctor.setName("嘎嘎");
        doctorService.insertDoctor(doctor);
    }

    @Test
    public void testDelete() {
        doctor = new Doctor();
        doctor.setId(1L);
        doctorService.deleteDoctorById(doctor.getId());
    }

    @Test
    public void testSelect() {
        doctor = new Doctor();
        doctor.setId(2L);
        Doctor result = doctorService.findDoctorById(doctor.getId());
        System.out.println(result);
    }
}