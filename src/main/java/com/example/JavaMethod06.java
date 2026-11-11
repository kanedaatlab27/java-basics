package com.example;

public class JavaMethod06 {
    public static String getAgeGroup(int age) { 
        if (age < 0) {
            return "エラー";
        }
        if (age < 20) {
            return "未成年";
        } else if (age < 65) {
            return "成人";
        } else {
            return "シニア";
        }
    }

    public static void main(String[] args) {
        System.out.println(getAgeGroup(15));
        System.out.println(getAgeGroup(30));
        System.out.println(getAgeGroup(70));
        System.out.println(getAgeGroup(-5));
    }
    
}
