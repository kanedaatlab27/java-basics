package com.example;

public class Designer extends Employee {
    private String tool;
        
    public Designer(String name, String department, int salary,String tool) {
        super(name, department, salary); 
        this.tool = tool;
    }

    public String getTool() {
        return this.tool;
    }

    public String toolInfo() {
        return "使用ツール: " + this.tool;
    }

    @Override
    public String info() {
        return getName() + "(デザイナー) / " + this.tool + "を使用 / 月給"
    + getSalary() + "万円";
    }
    
}
