package com.example;

public class JavaClass04 {
    public static void main(String[] args) {
        Book book1 = new Book("Java を学ぼう", "田中太郎", 2800);
        Book book2 = new Book("入門データ分析", "鈴木花子", 3200);
        Book book3 = new Book("Spring Boot 入門", "山田次郎", 3600);

        System.out.println(book1.getTitle()); // Java を学ぼう
        System.out.println(book2.getTitle()); // 入門データ分析
        System.out.println(book3.getTitle()); // Spring Boot 入門

    }
    
}
