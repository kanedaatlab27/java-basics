package com.example;

public class JavaClass05 {
    public static void main(String[] args) {
        Book book1 = new Book("銀河鉄道の夜", "宮沢賢治", 660);
        System.out.println(book1.info());
        int total = book1.getTotal(5);
        System.out.println("3 冊の合計: ¥" + total);


    }
    
}
