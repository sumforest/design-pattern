package com.sen.design.pattern.flyweight;

/**
 * @Auther: Sen
 * @Date: 2019/11/16 01:29
 * @Description:
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
