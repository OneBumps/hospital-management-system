package com.edu.xhu.service;

import com.edu.xhu.pojo.dao.dto.medicinedto;
import com.edu.xhu.pojo.entity.Medicine;

import java.util.List;

public interface MedicineService {
    int insertMedicine(Medicine medicine);

    int deleteMedicineById(Long id);

    int updateMedicine(Medicine medicine);

    List<Medicine> findMedicineAll();

    Medicine findMedicineById(Long id);
    List<Medicine> findmedicineByPage(medicinedto medicinedto);

    Long findmedicineByPageCount(medicinedto medicinedto);
}
