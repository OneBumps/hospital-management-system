package com.edu.xhu.pojo.entity;


public class Message {

    private Long id;
    //病人姓名
    private String name;
    //过敏史
    private String allergic;
    //状态
    private String state;
    //年龄
    private Integer age;
    //婚姻状况  0未婚 1已婚 2丧偶
    private Integer married;
    //手机号
    private String phoneNum;
    //性别    0男 1女
    private Integer sex;
    //身份证
    private String idNum;

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

    public String getAllergic() {
        return allergic;
    }

    public void setAllergic(String allergic) {
        this.allergic = allergic;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getMarried() {
        return married;
    }

    public void setMarried(Integer married) {
        this.married = married;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", allergic='" + allergic + '\'' +
                ", state='" + state + '\'' +
                ", age=" + age +
                ", married=" + married +
                ", phoneNum='" + phoneNum + '\'' +
                ", sex=" + sex +
                ", idNum='" + idNum + '\'' +
                '}';
    }
}

