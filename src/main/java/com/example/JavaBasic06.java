package com.example;

public class JavaBasic06 {
    public static void main(String[] args) {
        String birthYear = "1998";
        int currentYear = 2026;
        int age = currentYear - Integer.parseInt(birthYear);
        System.out.println(age);
        String s = String.format("誕生日は:%s年\n現在の年齢は%d歳", birthYear, age);
        System.out.println(s);
        double price = 1980.7;
        System.out.println((int)price);


    }
}
