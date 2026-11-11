package com.example;
import java.util.List;

public class JavaClass06 {
    public static void main(String[] args) {
        Book book1 = new Book("あ", "a", 2800);
        Book book2 = new Book("い", "b", 3200);
        Book book3 = new Book("う", "c", 3600);
        Book book4 = new Book("え", "d", 2400);

        List<Book> books = List.of(book1, book2, book3, book4);

        for (Book book : books) {
            System.out.println(book.info());
        }

        for (int i = 0; i < books.size(); i++) {
            System.out.println((i + 1) + ". " + books.get(i).info());
        }



        int total = 0;
        for (Book book : books) {
        total += book.getPrice(); // getter で価格を取り出す
        }
        System.out.println("合計金額: ¥" + total); // 出力: 合計金額: ¥12000

    }


    
}
