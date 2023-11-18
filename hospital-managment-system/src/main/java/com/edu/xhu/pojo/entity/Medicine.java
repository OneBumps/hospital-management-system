package com.edu.xhu.pojo.entity;

import java.io.Serializable;
import java.util.Date;

public class Medicine implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String drugname;
    private String brand;
    private boolean prescription;
    private String usagemethod;
    private Date drugdate;

    public Medicine() {
    }

    public Medicine(Long id, String drugname, String brand, boolean prescription, String usagemethod, Date drugdate) {
        this.id = id;
        this.drugname = drugname;
        this.brand = brand;
        this.prescription = prescription;
        this.usagemethod = usagemethod;
        this.drugdate = drugdate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDrugname() {
        return drugname;
    }

    public void setDrugname(String drugname) {
        this.drugname = drugname;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isPrescription() {
        return prescription;
    }

    public void setPrescription(boolean prescription) {
        this.prescription = prescription;
    }

    public String getUsagemethod() {
        return usagemethod;
    }

    public void setUsagemethod(String usagemethod) {
        this.usagemethod = usagemethod;
    }

    public Date getDrugdate() {
        return drugdate;
    }

    public void setDrugdate(Date drugdate) {
        this.drugdate = drugdate;
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "id=" + id +
                ", drugname='" + drugname + '\'' +
                ", brand='" + brand + '\'' +
                ", prescription=" + prescription +
                ", usagemethod='" + usagemethod + '\'' +
                ", drugdate=" + drugdate +
                '}';
    }
}
