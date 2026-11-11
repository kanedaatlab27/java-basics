package com.example;

public class JavaMethod03 {
    public static void main(String[] args) {
        showResult("田中", "数学", 88);
        showResult("鈴木", "英語", 72);
        showResult("山田", "国語", 95);
    }

    public static void showResult(String name, String subject, int score) {
        System.out.println(String.format("%sさんの%sの点数は%d点です",name,subject,score));


    }
}
