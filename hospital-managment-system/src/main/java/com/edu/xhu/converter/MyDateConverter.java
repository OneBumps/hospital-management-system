package com.edu.xhu.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String source) {
        try {
            SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
            return df.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
            throw new RuntimeException("日期转换失败!");
        }
    }
}