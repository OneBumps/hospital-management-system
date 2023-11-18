package com.edu.xhu.service.impl;


import com.edu.xhu.mapper.BedMapper;
import com.edu.xhu.pojo.dao.dto.BedQueryDto;
import com.edu.xhu.pojo.entity.Bed;
import com.edu.xhu.service.BedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BedServiceImpl implements BedService {

    @Autowired
    private BedMapper bedMapper;
    @Override
    public int insertBed(Bed bed) {
        return bedMapper.insertBed(bed);
    }

    @Override
    public List<Bed> findBedAll() {
        return bedMapper.findBedAll();
    }

    @Override
    public Bed findBedById(Long id) {
        return bedMapper.findBedById(id);
    }

    @Override
    public Bed findBedByBen(String bedNumber) {
        return bedMapper.findBedByBen(bedNumber);
    }

    @Override
    public Bed findBedByRon(String roomNumber) {
        return bedMapper.findBedByRon(roomNumber);
    }


    @Override
    public int deleteBedById(Long id) {
        return bedMapper.deleteBedById(id);
    }

    @Override
    public int updateBedById(Bed bed) {
        return bedMapper.updateBedById(bed);
    }

    @Override
    public int updateBedState(Bed bed) {
        return bedMapper.updateBedState(bed);
    }

    @Override
    public List<Bed> findBedByPage(BedQueryDto bedQueryDto){
        return bedMapper.findBedByPage(bedQueryDto);
    }

    @Override
    public Long findBedByPageCount(BedQueryDto bedQueryDto){
        return bedMapper.findBedByPageCount(bedQueryDto);
    }
}
