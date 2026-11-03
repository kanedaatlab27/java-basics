package com.example;
import java.util.List;
import java.util.ArrayList;

public class JavaLoops08 {
    public static void main(String[] args) {
        List<Integer> temps = List.of(18,22,35,28,41,30);
        for (int num : temps) {
            if (num >= 35) {
                System.out.println(String.format("猛暑日(%d度)が検出されました", num));
                break; 
            }
            System.out.println(String.format("{%d}度:問題なし", num));
        }
        List<String> grades = List.of("A", "C", "B", "F", "A", "D", "B");
        for (String grade : grades) {
            if (grade == "F") {
                System.out.println("不合格をスキップ");
                continue;
            }
            System.out.println(String.format("%s:合格", grade));
        }
    }

    
}
