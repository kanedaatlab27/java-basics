package com.example;

public class JavaBasic05 {
    public static void main(String[] args) {
        String name = "佐藤次郎";
        String subject = "Java";
        int score = 92;
        String rank = "A";
        System.out.println(name + "さんの" + subject + "の得点は" + score + "点です。");
        String s = String.format("%sさんの%sの得点は%d点です。", name, subject, score);
        System.out.println(s);

    }

      


}
