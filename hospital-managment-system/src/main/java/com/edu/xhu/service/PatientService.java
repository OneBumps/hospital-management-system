package com.edu.xhu.service;

import com.edu.xhu.pojo.dao.dto.PatientQueryDto;
import com.edu.xhu.pojo.entity.Patient;


import java.util.List;

public interface PatientService {
    /**
     * 插入病人
     * @param patient
     * @return
     */
    int insertPatient (Patient patient);

    /**
     * 按id查找病人
     * @param id
     * @return
     */
    Patient findPatientById (Long id);

    /**
     * 查找全部病人
     * @return
     */
    List<Patient> findAll();

    /**
     * 删除病人
     * @param id
     * @return
     */
    int deletePatientById(Long id);

    /**
     * 更新病人信息
     * @param patient
     * @return
     */
    int updatePatient(Patient patient);

    List<Patient> findPatientByPage(PatientQueryDto patientQueryDto);

    Long findPatientByPageCount(PatientQueryDto patientQueryDto);
}
