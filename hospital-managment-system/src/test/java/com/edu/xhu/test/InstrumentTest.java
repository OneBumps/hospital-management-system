package com.edu.xhu.test;

import com.edu.xhu.mapper.InstrumentMapper;
import com.edu.xhu.pojo.dao.dto.InstrumentQueryDto;
import com.edu.xhu.pojo.entity.Instrument;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/applicationContext-dao.xml")
public class InstrumentTest {
    @Autowired
    private InstrumentMapper instrumentMapper;

    @Test
    public void test1() {
        List<Instrument> all = instrumentMapper.findInstrumentAll();
        System.out.println(all);
    }

    @Test
    public void test2() {
        for (Integer i = 10; i < 100; i++) {

            Instrument instrument = new Instrument();
            instrument.setName("a" + i);
            instrument.setId(i.toString());
            instrument.setModel("h");
            instrument.setPrice((double) 23);
            instrument.setYear(2);
            instrumentMapper.insertSelective(instrument);
        }
    }

    @Test
    public void Test3() {
        InstrumentQueryDto dto = new InstrumentQueryDto();
        List<Instrument> instrumentByPage = instrumentMapper.findInstrumentByPage(dto);
        System.out.println("instrumentByPage = " + instrumentByPage);
    }
}