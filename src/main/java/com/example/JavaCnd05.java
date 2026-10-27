package com.example;

public class JavaCnd05 {
    public static void main(String[] args) {
        int age =17;
        boolean hasParent =true;
        if (age >=18 || hasParent == true){
            System.out.println("参加できます"); 
        } else {
            System.out.println("参加できません");
        }
        int hour =14;
        if (hour >=9 && hour <=18){
            System.out.println("参加できます"); 
        } else {
            System.out.println("参加できません");
        }
        boolean isRaining =false;
        if (!isRaining) {
            System.out.println("参加できません");

        }


    }
}

    
