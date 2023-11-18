package com.edu.xhu.pojo.dao.dto;

import java.io.Serializable;

public class BasePageDto implements Serializable {
    private Integer page = 1;

    private Integer limit = 5;

    private Integer startIndex;

    public Integer getStartIndex() {
        this.startIndex = (this.page - 1) * this.limit;
        return this.startIndex;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

}