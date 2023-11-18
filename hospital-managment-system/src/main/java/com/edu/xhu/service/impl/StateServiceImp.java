package com.edu.xhu.service.impl;


import com.edu.xhu.mapper.StateMapper;
import com.edu.xhu.pojo.dao.dto.StateQueryDto;
import com.edu.xhu.pojo.entity.State;
import com.edu.xhu.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StateServiceImp implements StateService {
    @Autowired
    private StateMapper stateMapper;
    @Override
    public int insertState(State state) {
        return stateMapper.insertState(state);
    }

    @Override
    public int deleteStateById(Long id) {
        return stateMapper.deleteStateById(id);
    }

    @Override
    public int updateState(State state) {
        return stateMapper.updateState(state);
    }

    @Override
    public int updateStateNow(State state) {
        return stateMapper.updateStateNow(state);
    }

    @Override
    public State findStateById(Long id) {
        return stateMapper.findStateById(id);
    }

    @Override
    public List<State> findStateByPage(StateQueryDto stateQueryDto) {
        return stateMapper.findStateByPage(stateQueryDto);
    }

    @Override
    public Long findStateByPageCount(StateQueryDto stateQueryDto) {
        return stateMapper.findStateByPageCount(stateQueryDto);
    }
}
