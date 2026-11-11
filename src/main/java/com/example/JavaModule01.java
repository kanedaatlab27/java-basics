package com.example;

public class JavaModule01 {
    public static void main(String[] args) {
        int sum = CalcUtils.add(10, 25);
        System.out.println(sum); 
        int product = CalcUtils.multiply(7, 8);
        System.out.println(product); 
        int result = CalcUtils.power(2, 10);
        System.out.println(result);
    }

}
