package com.example;

public class Employee {
    private String name;
    private String department;
    private int salary; 

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() { return this.name; }
    public String getDepartment() { return this.department; }
    public int getSalary() { return this.salary; }

    public String info() {
        return this.name + " / " + this.department + "部門 / 月給" +this.salary + "万円";
    }
    public int annualSalary() {
        return this.salary * 12; 
    }
    

    
}
