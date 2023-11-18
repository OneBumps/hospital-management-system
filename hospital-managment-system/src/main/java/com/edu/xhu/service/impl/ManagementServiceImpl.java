package com.edu.xhu.service.impl;

import com.edu.xhu.mapper.ManagementMapper;
import com.edu.xhu.pojo.dao.dto.ManagementPageDto;
import com.edu.xhu.pojo.entity.Management;
import com.edu.xhu.service.ManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagementServiceImpl implements ManagementService {
    @Autowired
    private ManagementMapper managementMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return managementMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Management record) {
        return managementMapper.insert(record);
    }

    @Override
    public Management selectByPrimaryKey(Long id) {
        return managementMapper.selectByPrimaryKey(id);
    }


    @Override
    public int updateByPrimaryKey(Management record) {
        return managementMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Management> selectAll(ManagementPageDto managementPageDto) {
        return managementMapper.selectAll(managementPageDto);
    }

    @Override
    public Long findCount(ManagementPageDto managementPageDto) {
        return managementMapper.findCount(managementPageDto);
    }

}