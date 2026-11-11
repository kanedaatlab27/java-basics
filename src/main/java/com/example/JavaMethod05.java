package com.example;

public class JavaMethod05 {
    public static int add(int a ,int b) {
        return a + b;
    }
    public static double triangleArea(double base ,double height) {
        return base * height / 2;

    }

    public static void main(String[] args) {
        int sum = add(3, 5);
        System.out.println(sum);
        double c = triangleArea(8.0, 4.0);
        System.out.println(c);


    }
    
}
