package com.edu.xhu.service.impl;

import com.edu.xhu.mapper.DeptMapper;
import com.edu.xhu.pojo.dao.dto.DeptQueryDto;
import com.edu.xhu.pojo.entity.Department;
import com.edu.xhu.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;//注入DeptMapper

    @Override
    public int insertDept(Department department) {
        return deptMapper.insertDept(department);
    }

    @Override
    public int deleteDeptById(Long id) {
        return deptMapper.deleteLineById(id);
    }

    @Override
    public int updateDept(Department department) {
        return deptMapper.updateDept(department);
    }

    @Override
    public List<Department> findDeptAll() {
        return deptMapper.findDeptAll();
    }

    @Override
    public Department findDeptById(Long id) {
        return deptMapper.findDeptById(id);
    }

    @Override
    public List<Department> findDeptByPage(DeptQueryDto deptQueryDto) {
        return deptMapper.findDeptByPage(deptQueryDto);
    }

    @Override
    public Long findDeptByPageCount(DeptQueryDto deptQueryDto) {
        return deptMapper.findDeptByPageCount(deptQueryDto);
    }


}