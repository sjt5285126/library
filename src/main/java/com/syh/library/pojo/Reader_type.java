package com.syh.library.pojo;

import java.util.Date;

public class Reader_type {
    private String type;
    private Date rent_time;
    private Integer most_rent_time;

    @Override
    public String toString() {
        return "Reader_type{" +
                "type='" + type + '\'' +
                ", rent_time=" + rent_time +
                ", most_rent_time=" + most_rent_time +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getRent_time() {
        return rent_time;
    }

    public void setRent_time(Date rent_time) {
        this.rent_time = rent_time;
    }

    public Integer getMost_rent_time() {
        return most_rent_time;
    }

    public void setMost_rent_time(Integer most_rent_time) {
        this.most_rent_time = most_rent_time;
    }
}
