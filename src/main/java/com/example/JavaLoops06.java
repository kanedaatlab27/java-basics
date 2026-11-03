package com.example;
import java.util.Map;
import java.util.HashMap;

public class JavaLoops06 {
    public static void main(String[] args) {
        Map<String, Integer> population = new HashMap<>();
        population.put("東京", 1400);
        population.put("大阪", 880);
        population.put("名古屋", 230);
        population.put("福岡", 160);
        for (String country : population.keySet()) {
            Integer city = population.get(country);
            System.out.println(String.format("%s の人口は約%d万人 です", country, city));
            }
    
        for (Map.Entry<String, Integer> entry : population.entrySet()) {
            System.out.println(entry.getKey() + "：" + entry.getValue() + "万人");
        }
        for (Map.Entry<String, Integer> entry : population.entrySet()) {
            if ( entry.getValue()>=500) {
                System.out.println(entry.getKey() + "：" + entry.getValue() + "万人" + "大都市");
            }

        }
    }

}
