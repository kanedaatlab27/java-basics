package com.example;

public class JavaCnd04 {
    public static void main(String[] args) {
        double bmi = 22.5;
        if (bmi <18.5) {
            System.out.println("低体重");   
        } else if  (bmi <25.0) {
            System.out.println("普通体重");   
        } else if  (bmi <30.0) {
            System.out.println("カ体重");   
        } else {
            System.out.println("肥満");
        }
    }
}

    
