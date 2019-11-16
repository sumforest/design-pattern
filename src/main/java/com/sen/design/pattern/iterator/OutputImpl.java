package com.sen.design.pattern.iterator;

import java.util.Iterator;

/**
 * @Auther: Sen
 * @Date: 2019/11/16 22:28
 * @Description:
 */
public class OutputImpl {
    private College college;

    public OutputImpl(College college) {
        this.college = college;
    }

    public void printDepartment() {
        Iterator iterator = college.createIterator();
        while (iterator.hasNext()) {
            Department next = (Department) iterator.next();
            System.out.println(next.getName());
        }
    }

    public void printCollege() {
        System.out.println("------------"+college.getName()+"------------");
    }

}
