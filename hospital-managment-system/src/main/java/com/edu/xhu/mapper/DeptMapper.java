package com.edu.xhu.mapper;

import com.edu.xhu.pojo.dao.dto.DeptQueryDto;
import com.edu.xhu.pojo.entity.Department;

import java.util.List;


public interface DeptMapper {

    //添加部门
    int insertDept(Department department);

    //删除部门(通过id删除)
    int deleteLineById(Long id);

    //修改部门信息（通过id）
    int updateDept(Department department);

    //查询全部部门
    List<Department> findDeptAll();

    //根据id查询部门
    Department findDeptById(Long id);

    //分页查询部门数据
    List<Department> findDeptByPage(DeptQueryDto deptQueryDto);

    //分页查询线路数据总计数
    Long findDeptByPageCount(DeptQueryDto lineQueryDto);
}