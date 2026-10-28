package com.example;
import java.util.List;
import java.util.ArrayList;

public class JavaLoops03 {
    public static void main(String[] args) {
        List<String> menus = List.of("ラーメン", "カレー", "パスタ", "寿司", "天ぷら");
        for (String menu : menus) {
            System.out.println("本日のメニュー：" + menu );
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        List<Integer> prices = List.of(980, 1200, 750, 1500, 880);
        int total = 0;
        for (int price : prices) {
            total += price;
        }
        System.out.println(String.format("合計:%d 円", total));
    }
}
