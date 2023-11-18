package com.edu.xhu.service.impl;

import com.edu.xhu.mapper.MedicineMapper;
import com.edu.xhu.pojo.dao.dto.medicinedto;
import com.edu.xhu.pojo.entity.Medicine;
import com.edu.xhu.service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicineServiceImpl implements MedicineService {
    @Autowired
    private MedicineMapper medicineMapper;

    @Override
    public int insertMedicine(Medicine medicine) {
        return medicineMapper.insert(medicine);
    }

    @Override
    public int deleteMedicineById(Long id) {
        return medicineMapper.deleteById(id);
    }

    @Override
    public int updateMedicine(Medicine medicine) {
        return medicineMapper.updateById(medicine);
    }

    @Override
    public List<Medicine> findMedicineAll() {
        return medicineMapper.selectAll();
    }

    @Override
    public Medicine findMedicineById(Long id) {
        return medicineMapper.selectById(id);
    }

    @Override
    public List<Medicine> findmedicineByPage(medicinedto medicinedto) {
        return medicineMapper.findmedicineByPage(medicinedto);
    }

    @Override
    public Long findmedicineByPageCount(medicinedto medicinedto) {
        return medicineMapper.findmedicineByPageCount(medicinedto);
    }


}