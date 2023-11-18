package com.edu.xhu.mapper;


import com.edu.xhu.pojo.dao.dto.StateQueryDto;
import com.edu.xhu.pojo.entity.State;

import java.util.List;

public interface StateMapper {
    /**
     * 添加
     * @param state
     * @return
     */
    int insertState (State state);

    /**
     * 删除
     * @param id
     * @return
     */
    int deleteStateById (Long id);

    /**
     * 修改
     * @param state
     * @return
     */
    int updateState(State state);

    /**
     * 修改病人状态
     * @param state
     * @return
     */
    int updateStateNow(State state);

    /**
     * 根据ID查询
     * @param id
     * @return
     */
    State findStateById(Long id);

    List<State> findStateByPage(StateQueryDto stateQueryDto);

    Long findStateByPageCount(StateQueryDto stateQueryDto);
}
