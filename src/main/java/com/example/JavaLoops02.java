package com.example;
import java.util.List;
import java.util.ArrayList;

public class JavaLoops02 {
    public static void main(String[] args) {
        List<String> languages = new ArrayList<>(List.of("Python", "Java", "PHP"));
        System.out.println(languages);
        languages.set(1, "JavaScript");
        System.out.println(languages);
        languages.add("GO");
        languages.add("Ruby");
        System.out.println(languages);
        List<Integer> numbers = new ArrayList<>();
        numbers.add(0,10);
        numbers.add(1,20);
        numbers.add(2,30);
        numbers.add(3,40);
        numbers.add(4,50);
        System.out.println(numbers);


    }
}
