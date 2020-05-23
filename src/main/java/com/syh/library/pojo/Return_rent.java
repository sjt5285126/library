package com.syh.library.pojo;

import java.util.Date;

public class Return_rent {
    private String book_id;
    private String card_id;
    private Date rent_time;
    private Date return_time;

    @Override
    public String toString() {
        return "Return_rent{" +
                "book_id='" + book_id + '\'' +
                ", card_id='" + card_id + '\'' +
                ", rent_time=" + rent_time +
                ", return_time=" + return_time +
                '}';
    }

    public String getBook_id() {
        return book_id;
    }

    public void setBook_id(String book_id) {
        this.book_id = book_id;
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

    public Date getReturn_time() {
        return return_time;
    }

    public void setReturn_time(Date return_time) {
        this.return_time = return_time;
    }
}
