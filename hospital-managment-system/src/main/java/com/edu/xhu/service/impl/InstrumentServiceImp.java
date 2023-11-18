package com.edu.xhu.service.impl;
import com.edu.xhu.mapper.InstrumentMapper;
import com.edu.xhu.pojo.dao.dto.InstrumentQueryDto;
import com.edu.xhu.pojo.entity.Instrument;
import com.edu.xhu.service.InstrumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstrumentServiceImp implements InstrumentService {
    @Autowired
    private InstrumentMapper instrumentMapper;

    @Override
    public List<Instrument> findAll() {
        return  instrumentMapper.findInstrumentAll();
    }
    @Override
    public Instrument selectByPrimaryKey(Long id) {
        return instrumentMapper.selectByPrimaryKey(id);
    }

    //通过主键id更新
    public int updateByPrimaryKey(Instrument record){
        return instrumentMapper.updateByPrimaryKey(record);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return instrumentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(Instrument record) {
        return instrumentMapper.insertSelective(record);
    }
    @Override
    public int updateByPrimaryKeySelective(Instrument record) {
        return instrumentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<Instrument> findInstrumentByPage(InstrumentQueryDto instrumentQueryDto) {
        return instrumentMapper.findInstrumentByPage(instrumentQueryDto);
    }

    @Override
    public Long findInstrumentCount(InstrumentQueryDto instrumentQueryDto) {
        return instrumentMapper.findInstrumentCount(instrumentQueryDto);
    }
}
