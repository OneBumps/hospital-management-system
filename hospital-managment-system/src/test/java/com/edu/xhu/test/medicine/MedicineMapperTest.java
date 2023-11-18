package com.edu.xhu.test.medicine;

import com.edu.xhu.mapper.MedicineMapper;
import com.edu.xhu.pojo.entity.Medicine;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sound.sampled.Line;
import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/applicationContext.xml")
public class MedicineMapperTest {
    @Autowired
    private MedicineMapper medicineMapper;
    private Medicine medicine;
    @Test
    public void insertTest() {
        medicine = new Medicine();
        medicine.setDrugname("感冒零");
        medicine.setBrand("999");
        medicine.setPrescription(true);
        medicine.setDrugdate(new Date(System.currentTimeMillis()));
        medicine.setUsagemethod("口服");
        medicineMapper.insert(medicine);

        System.out.println(medicine.getId());


    }

    @Test
    public void deleteTest() {
        Long id = 2L; // 修改值
        medicineMapper.deleteById(id);
    }

    @Test
    public void updateTest(){
        Long id = 1L;
        medicine = new Medicine();

        medicine.setBrand("666");
        medicine.setDrugname("藿香正气液");
        medicine.setDrugdate(new Date(1L));
        medicine.setPrescription(true);
        medicine.setUsagemethod("外服");
        medicine.setId(id);
        medicineMapper.updateById(medicine);
    }
    @Test
    public void selectByIdTest() {
        Long id = 1L; // 修改值
       medicine = medicineMapper.selectById(id);
        System.out.println(medicine);
    }

    @Test
    public void selectAllTest() {

        medicine = new Medicine();
        List<Medicine> medicine = medicineMapper.selectAll();
        for (Medicine resList : medicine) {
            System.out.println(resList);
        }
    }

}
