package com.syh.library.pojo;

import java.util.Date;

public class Rent {
    private String book_id;
    private String card_id;
    private Date rent_time;

    @Override
    public String toString() {
        return "Rent{" +
                "book_id='" + book_id + '\'' +
                ", card_id='" + card_id + '\'' +
                ", rent_time=" + rent_time +
                '}';
    }

    public String getCard_id() {
        return card_id;
    }

    public void setCard_id(String card_id) {
        this.card_id = card_id;
    }

    public Date getRent_time() {
        return rent_time;
    }

    public void setRent_time(Date rent_time) {
        this.rent_time = rent_time;
    }

    public String getBook_id() {
        return book_id;
    }

    public void setBook_id(String book_id) {
        this.book_id = book_id;
    }
}
