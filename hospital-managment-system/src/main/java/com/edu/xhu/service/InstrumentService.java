package com.edu.xhu.service;

import com.edu.xhu.pojo.dao.dto.InstrumentQueryDto;
import com.edu.xhu.pojo.entity.Instrument;

import java.util.List;

public interface InstrumentService {
    //查询所有的仪器
    List<Instrument>findAll();

    //ID查找
    Instrument selectByPrimaryKey(Long id);

    //更新
    int updateByPrimaryKey(Instrument record);

    //修改
    int deleteByPrimaryKey(Long id);
    int insertSelective(Instrument record);

    int updateByPrimaryKeySelective(Instrument record);

    List<Instrument> findInstrumentByPage(InstrumentQueryDto instrumentQueryDto);
    Long findInstrumentCount(InstrumentQueryDto instrumentQueryDto);




}
