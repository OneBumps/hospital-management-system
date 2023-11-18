package com.edu.xhu.service;



import com.edu.xhu.pojo.dao.dto.BedQueryDto;
import com.edu.xhu.pojo.entity.Bed;

import java.util.List;


public interface BedService {
    /**
     * 插入病床
     * @param bed
     * @return
     */
    int insertBed(Bed bed);

    /**
     * 查找所有病床
     * @return
     */
    List<Bed> findBedAll();

    /**
     * 根据id查询病床
     * @param id
     * @return
     */
    Bed findBedById(Long id);

    /**
     *根据病床号查询
     * @param bedNumber
     * @return
     */
    Bed findBedByBen(String bedNumber);

    /**
     * 根据房间号查询
     * @param roomNumber
     * @return
     */
    Bed findBedByRon(String roomNumber);

    /**
     * 根据id删除病床
     * @param id
     * @return
     */
    int deleteBedById(Long id);

    /**
     *修改病床
     * @param bed
     * @return
     */
    int updateBedById(Bed bed);

    /**
     * 修改病床状态
     * @param bed
     * @return
     */
    int updateBedState(Bed bed);
    /**
     * 分页查询病床数据
     * @param bedQueryDto
     * @return
     */
    List<Bed> findBedByPage(BedQueryDto bedQueryDto);

    /**
     * 分页查询病床数据
     * @param bedQueryDto
     * @return
     */
    Long findBedByPageCount(BedQueryDto bedQueryDto);
}
