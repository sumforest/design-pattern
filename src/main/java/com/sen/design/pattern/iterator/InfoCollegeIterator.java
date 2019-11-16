package com.sen.design.pattern.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @Auther: Sen
 * @Date: 2019/11/16 22:10
 * @Description:
 */
public class InfoCollegeIterator implements Iterator {
    private List<Department> departments;
    private int index = 0;

    public InfoCollegeIterator(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        boolean isHas = true;
        if (index >= departments.size() || departments.get(index) == null) {
            isHas = false;
        }
        return isHas;
    }

    @Override
    public Object next() {
        Department department = departments.get(index);
        index++;
        return department;
    }
}
