package com.syh.library.pojo;

public class Book {
    private String book_id;
    private String book_name;
    private String author;
    private String classfiy;
    private float piece;
    private String publisher;
    private String summary;
    private Integer totle_number;
    private Integer now_number;
    private String located;
    private Integer rent_times;

    @Override
    public String toString() {
        return "Book{" +
                "book_id='" + book_id + '\'' +
                ", book_name='" + this.book_name + '\'' +
                ", author='" + author + '\'' +
                ", classfiy='" + classfiy + '\'' +
                ", piece=" + piece +
                ", publisher='" + publisher + '\'' +
                ", summary='" + summary + '\'' +
                ", totle_number=" + totle_number +
                ", now_number=" + now_number +
                ", located='" + located + '\'' +
                ", rent_times=" + rent_times +
                '}';
    }

    public String getBook_id() {
        return book_id;
    }

    public void setBook_id(String book_id) {
        this.book_id = book_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getClassfiy() {
        return classfiy;
    }

    public void setClassfiy(String classfiy) {
        this.classfiy = classfiy;
    }

    public float getPiece() {
        return piece;
    }

    public void setPiece(float piece) {
        this.piece = piece;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Integer getTotle_number() {
        return totle_number;
    }

    public void setTotle_number(Integer totle_number) {
        this.totle_number = totle_number;
    }

    public Integer getNow_number() {
        return now_number;
    }

    public void setNow_number(Integer now_number) {
        this.now_number = now_number;
    }

    public String getLocated() {
        return located;
    }

    public void setLocated(String located) {
        this.located = located;
    }

    public Integer getRent_times() {
        return rent_times;
    }

    public void setRent_times(Integer rent_times) {
        this.rent_times = rent_times;
    }
}
