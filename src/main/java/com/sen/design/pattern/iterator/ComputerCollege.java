package com.sen.design.pattern.iterator;

import java.util.Iterator;

/**
 * @Auther: Sen
 * @Date: 2019/11/16 22:15
 * @Description:
 */
public class ComputerCollege implements College {

    private Department[] departments;
    private int index = 4;

    public ComputerCollege() {
        this.departments = new Department[10];
        departments[0] = new Department("java");
        departments[1] = new Department("php");
        departments[2] = new Department("go");
        departments[3] = new Department("c++");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name) {
        Department department = new Department(name);
        departments[index] = department;
        index++;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
