package com.sen.design.pattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Auther: Sen
 * @Date: 2019/11/16 22:26
 * @Description:
 */
public class InfoCollege implements College {
    private List<Department> departments;

    public InfoCollege() {
        this.departments = new ArrayList<>();
        departments.add(new Department("通讯工程"));
        departments.add(new Department("信息工程"));
        departments.add(new Department("网络工程"));
    }

    @Override
    public String getName() {
        return "信息工程学院";
    }

    @Override
    public void addDepartment(String name) {
        departments.add(new Department(name));
    }

    @Override
    public Iterator createIterator() {
        return new InfoCollegeIterator(departments);
    }
}
