package com.onebumps.pojo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @TableName doctor
 */
public class Doctor implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String doctorNumber;
    private String name;
    private String gender;
    private Integer age;
    private String phone;
    private String position;
    private Date employmentDate;
    private Integer salary;
    private String notes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDoctorNumber() {
        return doctorNumber;
    }

    public void setDoctorNumber(String doctorNumber) {
        this.doctorNumber = doctorNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Date getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(Date employmentDate) {
        this.employmentDate = employmentDate;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Doctor{" + "id=" + id + ", doctorNumber='" + doctorNumber + '\'' + ", name='" + name + '\'' + ", gender='" + gender + '\'' + ", age=" + age + ", phone='" + phone + '\'' + ", position='" + position + '\'' + ", employmentDate=" + employmentDate + ", salary=" + salary + ", notes='" + notes + '\'' + '}';
    }
}