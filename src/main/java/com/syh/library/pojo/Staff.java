package com.syh.library.pojo;

public class Staff {
    private String staff_id;
    private String staff_name;
    private String duty;
    private String salary;

    @Override
    public String toString() {
        return "Staff{" +
                "staff_id='" + staff_id + '\'' +
                ", staff_name='" + staff_name + '\'' +
                ", duty='" + duty + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }

    public String getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(String staff_id) {
        this.staff_id = staff_id;
    }

    public String getStaff_name() {
        return staff_name;
    }

    public void setStaff_name(String staff_name) {
        this.staff_name = staff_name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }
}
