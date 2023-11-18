package com.edu.xhu.pojo.entity;

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
    private Integer gender;
    private Integer age;
    private String phone;
    private Date employmentDate;
    private Integer salary;
    private String notes;

    private Integer departmentId;

    private Department department;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

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

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
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
        return "Doctor{" + "id=" + id + ", doctorNumber='" + doctorNumber + '\'' + ", name='" + name + '\'' + ", gender=" + gender + ", age=" + age + ", phone='" + phone + '\'' + ", employmentDate=" + employmentDate + ", salary=" + salary + ", notes='" + notes + '\'' + ", departmentId=" + departmentId + ", department=" + department + '}';
    }
}