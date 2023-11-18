package com.edu.xhu.mapper;


import com.edu.xhu.pojo.dao.dto.InstrumentQueryDto;
import com.edu.xhu.pojo.entity.Instrument;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public interface InstrumentMapper {
    int deleteByPrimaryKey(Long id);
    int insert(Instrument record);

    int insertSelective(Instrument record);

    Instrument selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Instrument record);

    int updateByPrimaryKey(Instrument record);
    List<Instrument> findInstrumentAll();

    List<Instrument> findInstrumentByPage(InstrumentQueryDto instrumentQueryDto);
    Long findInstrumentCount(InstrumentQueryDto instrumentQueryDto);

}
