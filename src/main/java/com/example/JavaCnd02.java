package com.example;

public class JavaCnd02 {

    public static void main(String[] args) {
        int height = 162;
        if (height>=160) {
        System.out.println("身長 160cm 以上です");
        }
        int price = 980;
        if (price<1000) {
            System.out.println("1000円未満です");
        }
        int passScore = 70;
        int myScore = 70;
        if (passScore==myScore) {
             System.out.println("ちょうど合格ラインです");
        }
    }
}
