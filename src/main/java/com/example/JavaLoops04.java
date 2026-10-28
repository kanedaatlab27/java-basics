package com.example;
import java.util.Map;
import java.util.HashMap;

public class JavaLoops04 {
    public static void main(String[] args) {
        Map<String, Object> book = new HashMap<>();
        book.put("title", "吾輩は猫である");
        book.put("author", "夏目漱石");
        book.put("year", "1905");
        book.put("pages", "648");
        System.out.println(book.get("title"));
        System.out.println(book.get("author"));
        System.out.println(String.format("%s(%s、%s年)", book.get("title"),book.get("author"),book.get("year")));
        Map<String, Integer> product = new HashMap<>();
        product.put("price", 89800);
        product.put("stock", 15);
        if (product.get("stock") >=10) {
            System.out.println("在庫あり（15個）");     
        } else {
            System.out.println("在庫わずか");
        }

    }
}
