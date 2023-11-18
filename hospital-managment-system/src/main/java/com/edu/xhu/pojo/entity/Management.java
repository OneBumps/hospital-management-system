package com.edu.xhu.pojo.entity;

import java.io.Serializable;

/**
 * @TableName management
 */
public class Management implements Serializable {
    private Long id;

    private String name;

    private Integer grade;

    private String description;

    private Integer open;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getOpen() {
        return open;
    }

    public void setOpen(Integer open) {
        this.open = open;
    }

    @Override
    public String toString() {
        return "Management{" + "id=" + id + ", name='" + name + '\'' + ", grade=" + grade + ", description='" + description + '\'' + ", open=" + open + '}';
    }
}