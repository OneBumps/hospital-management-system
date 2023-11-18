package com.edu.xhu.mapper;

import com.edu.xhu.pojo.dao.dto.medicinedto;
import com.edu.xhu.pojo.entity.Medicine;

import java.util.List;

public interface MedicineMapper {
    int insert(Medicine medicine);

    int deleteById(Long id);

    int updateById(Medicine medicine);

    List<Medicine> selectAll();
    Medicine selectById(Long id);

    List<Medicine> findmedicineByPage(medicinedto medicinedto);

    Long findmedicineByPageCount(medicinedto medicinedto);
}
