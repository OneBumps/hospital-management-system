package com.edu.xhu.pojo.entity;

public class State {
    private Long id;
    private String name;
    //目前状态
    private Integer now;
    //生活方式
    private String live;
    //服药服从性
    private String medication;
    //不良反应
    private int unEffect;
    //睡眠
    private String sleep;

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

    public Integer getNow() {
        return now;
    }

    public void setNow(Integer now) {
        this.now = now;
    }

    public String getLive() {
        return live;
    }

    public void setLive(String live) {
        this.live = live;
    }

    public String getMedication() {
        return medication;
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }

    public int getUnEffect() {
        return unEffect;
    }

    public void setUnEffect(int unEffect) {
        this.unEffect = unEffect;
    }

    public String getSleep() {
        return sleep;
    }

    public void setSleep(String sleep) {
        this.sleep = sleep;
    }

    @Override
    public String toString() {
        return "State{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", now='" + now + '\'' +
                ", live='" + live + '\'' +
                ", medication='" + medication + '\'' +
                ", unEffect=" + unEffect +
                ", sleep='" + sleep + '\'' +
                '}';
    }
}
