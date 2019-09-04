package com.demo.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuan
 */
public class ManagerDepartment implements Department{
    private int id;
    private String name;
    private List<Department> childDepartments;
    public ManagerDepartment(int id, String name){
        this.id = id;
        this.name = name;
        this.childDepartments = new ArrayList<>();
    }
    @Override
    public void printDepartmentName() {
        childDepartments.forEach(Department::printDepartmentName);
    }
    public void addDepartment(Department department) {
        childDepartments.add(department);
    }

    public void removeDepartment(Department department) {
        childDepartments.remove(department);
    }

    public List<Department> getChild()
    {
        return childDepartments;
    }
}
