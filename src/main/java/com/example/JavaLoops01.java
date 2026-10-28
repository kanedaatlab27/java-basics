package com.example;
import java.util.List;
import java.util.ArrayList;

public class JavaLoops01 {
    public static void main(String[] args) {
        String[] cities = {"北海道", "宮城", "東京", "愛知", "大阪", "福岡", "沖縄"};
        System.out.println(cities[0]); 
        System.out.println(cities[2]);
        System.out.println(cities[4]);
        System.out.println(String.format("3番目の都市は%s です", cities[2] ));
        List<Integer> scores = new ArrayList<>(List.of(72, 88, 95, 61, 79));
        System.out.println(scores.get(scores.size() - 1));
    }

}
