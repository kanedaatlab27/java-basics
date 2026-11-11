package com.example;

public class CalcUtils {
    public static int add(int a, int b) {
        return a + b;
        }
        public static int multiply(int a, int b) {
        return a * b;
        }
        public static int power(int base, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
        result *= base;
        }
        return result;
        }
    
}
