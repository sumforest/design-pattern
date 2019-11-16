package com.sen.design.pattern.iterator;

import java.util.Iterator;

/**
 * @Auther: Sen
 * @Date: 2019/11/16 22:15
 * @Description:
 */
public interface College {
    String getName();

    void addDepartment(String name);

    Iterator createIterator();
}
