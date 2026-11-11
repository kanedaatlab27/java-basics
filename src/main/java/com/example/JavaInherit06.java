package com.example;
import java.util.List;

public class JavaInherit06 {
    public static void main(String[] args) {
        Employee e1 = new Engineer("田中太郎", "開発", 45, "Java");
        Employee e2 = new Engineer("田中", "開", 4, "Ja");
        Employee e3 = new Designer("鈴木花子", "デザイン", 38, "Figma");
        Employee e4 = new Designer("鈴木", "デザ", 3, "Fi");

        List<Employee> employees = List.of(new Engineer("田中太郎", "開発", 45, "Java"),
        new Engineer("伊藤次郎", "開発", 40, "Python"),
        new Designer("鈴木花子", "デザイン", 38, "Figma"),
        new Designer("高橋陽子", "デザイン", 35, "Illustrator")
        );

        for (Employee e : employees) {
            System.out.println(e.info());
        }

    }
    
}
