package com.example;

public class JavaLoops07 {
    public static void main(String[] args) {
        int hp = (100);
        while (hp > 0) {
        System.out.println(hp);
            hp -= 25;
        }
        System.out.println("ゲームオーバー");
        int n = (1);
        while (n <= 100) {
            System.out.println(n);
            n = n * 2;
        }
    }
}
