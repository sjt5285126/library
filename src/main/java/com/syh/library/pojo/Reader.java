package com.syh.library.pojo;

public class Reader {
    private String cardId;
    private String name;
    private String sex;
    private String department;
    private String classfiy;
    private String level;
    private Integer now_rent_num;

    @Override
    public String toString() {
        return "Reader{" +
                "cardId='" + cardId + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", department='" + department + '\'' +
                ", classfiy='" + classfiy + '\'' +
                ", level='" + level + '\'' +
                ", now_rent_num=" + now_rent_num +
                '}';
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getClassfiy() {
        return classfiy;
    }

    public void setClassfiy(String classfiy) {
        this.classfiy = classfiy;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Integer getNow_rent_num() {
        return now_rent_num;
    }

    public void setNow_rent_num(Integer now_rent_num) {
        this.now_rent_num = now_rent_num;
    }
}
