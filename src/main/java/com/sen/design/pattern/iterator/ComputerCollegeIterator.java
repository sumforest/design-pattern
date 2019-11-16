package com.sen.design.pattern.iterator;

import java.util.Iterator;

/**
 * @Auther: Sen
 * @Date: 2019/11/16 22:03
 * @Description:
 */
public class ComputerCollegeIterator implements Iterator {
    private Department[] departments;
    private int index = 0;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        boolean isHas = true;
        if (departments.length <= index || departments[index] == null) {
            isHas = false;
        }
        return isHas;
    }

    @Override
    public Object next() {
        Department department = departments[index];
        index++;
        return department;
    }
}
