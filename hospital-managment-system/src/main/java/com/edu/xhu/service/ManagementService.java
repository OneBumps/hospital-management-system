package com.edu.xhu.service;

import com.edu.xhu.pojo.dao.dto.ManagementPageDto;
import com.edu.xhu.pojo.entity.Management;

import java.util.List;

public interface ManagementService {
    int deleteByPrimaryKey(Long id);

    int insert(Management record);

    Management selectByPrimaryKey(Long id);

    int updateByPrimaryKey(Management record);

    List<Management> selectAll(ManagementPageDto managementPageDto);

    Long findCount(ManagementPageDto managementPageDto);
}