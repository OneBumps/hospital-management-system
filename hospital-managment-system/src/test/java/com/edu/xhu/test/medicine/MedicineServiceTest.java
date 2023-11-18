package com.edu.xhu.test.medicine;

import com.edu.xhu.mapper.MedicineMapper;
import com.edu.xhu.pojo.entity.Medicine;
import com.edu.xhu.service.MedicineService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/applicationContext.xml")
public class MedicineServiceTest {
    @Autowired
    private MedicineService medicineService;
    private Medicine medicine;

    @Test
    public void Test() {
        medicine = new Medicine();
        medicine.setDrugname("感冒零");
        medicine.setPrescription(true);
        medicine.setDrugdate(new Date(System.currentTimeMillis()));
        medicine.setUsagemethod("口服");
        medicine.setBrand("666");
        medicineService.insertMedicine(medicine);
        medicine.setBrand("555");
        medicineService.updateMedicine(medicine);
        medicineService.findMedicineById(1L);



    }
    @Test
    public void deleteTest() {
        Long id = 1L; // 可修改
        medicineService.deleteMedicineById(id);
    }

    @Test
    public void findAllTest() {

        System.out.println(medicineService.findMedicineAll());
    }

}
