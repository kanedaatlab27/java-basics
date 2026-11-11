package com.example;

public class Book {
    private String title;
    private String author;
    private int price;

    public Book(String title, String author, int price) {
        // 引数で受け取った値をフィールドに代入する
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String info() {
        return this.title + "(" + this.author + "著): ¥" + this.price;
    }

    public int getTotal(int count) {
        return this.price * count;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    
    
}
