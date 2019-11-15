package com.sen.design.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: Sen
 * @Date: 2019/11/15 22:46
 * @Description:
 */
public class Department extends OrgenizationComponent {

    public Department(String name, String dec) {
        super(name, dec);
    }

    @Override
    protected void print() {
        System.out.println(this.name);
    }
}
