package com.edu.xhu.service;

import com.edu.xhu.pojo.dao.dto.DeptQueryDto;
import com.edu.xhu.pojo.entity.Department;

import java.util.List;

public interface DeptService {
    //查询全部部门
    List<Department> findDeptAll();

    //添加部门
    int insertDept(Department department);

    //删除部门(通过id删除)
    int deleteDeptById(Long id);

    //根据id查询部门（回显）
    Department findDeptById(Long id);

    //修改部门信息（通过id）
    int updateDept(Department department);

    //分页查询
    List<Department> findDeptByPage(DeptQueryDto deptQueryDto);

    //分页查询线路数据总计数
    Long findDeptByPageCount(DeptQueryDto deptQueryDto);
}