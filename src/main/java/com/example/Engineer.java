package com.example;

public class Engineer extends Employee {
    private String language;
        
    public Engineer(String name, String department, int salary,String
        language) {
        super(name, department, salary); 
        this.language = language;
    }

    public String getLanguage() {
        return this.language;
    }

    public String skillInfo() {
        return "得意言語: " + this.language;
    }

    @Override
    public String info() {
        return super.info() + " / 得意言語: " + this.language;
    }

        
    
}
