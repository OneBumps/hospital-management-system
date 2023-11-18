package com.edu.xhu.mapper;

import com.edu.xhu.pojo.dao.dto.ManagementPageDto;
import com.edu.xhu.pojo.entity.Management;

import java.util.List;

/**
 * @author One Bumps
 * @description 针对表【management(管理员表)】的数据库操作Mapper
 * @createDate 2023-11-17 19:33:20
 * @Entity com.edu.xhu.pojo.entity.Management
 */
public interface ManagementMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Management record);

    Management selectByPrimaryKey(Long id);

    List<Management> selectAll(ManagementPageDto managementPageDto);

    int updateByPrimaryKey(Management record);

    Long findCount(ManagementPageDto managementPageDto);


}