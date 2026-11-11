package com.example;
import java.util.Random;
import java.util.List;

public class JavaModule03 {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(100) + 1;
        System.out.println(num);
        System.out.println(num);
        System.out.println(num);
        List<String> candidates = List.of("田中", "鈴木", "山田", "佐藤", "伊藤");
        String name = candidates.get(rand.nextInt(candidates.size()));
        System.out.println("今月の当番:" + name);

    }
    
}
