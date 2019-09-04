package com.demo.composite;

/**
 * @author yuan
 */
public class FinancialDepartment implements Department{
    private int id;
    private String name;
    public FinancialDepartment(int id, String name){
        this.id = id;
        this.name = name;
    }
    @Override
    public void printDepartmentName() {
        System.out.println(id + " " + name);
    }
}
