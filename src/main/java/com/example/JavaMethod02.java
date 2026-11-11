package com.example;

public class JavaMethod02 {
    public static void main(String[] args) {
        showProduct("ノートパソコン");
        showProduct("スマートフォン");
        showProduct("タブレット");
        showPrice(100);


    }
    public static void showProduct(String productName) {
        System.out.println(productName);
    }
    public static void showPrice(int price) {
        System.out.println(String.format("価格：%d円(税込：{%d*1.1円})",price,price));
        
    }
}