package com.onebumps.mapper;

import com.onebumps.pojo.entity.Department;

/**
 * @author One Bumps
 * @description 针对表【department】的数据库操作Mapper
 * @createDate 2023-11-08 22:25:58
 * @Entity com.onebumps.pojo.entity.Department
 */
public interface DepartmentMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Department record);

    int insertSelective(Department record);

    Department selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);
}