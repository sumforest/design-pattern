package com.sen.design.pattern.facotry.abstractfactory;

/**
 * @Auther: Sen
 * @Date: 2019/11/14 23:17
 * @Description:
 */
public abstract class Pizza {
    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    public abstract void prepare();

    public void bake() {
        System.out.println(name + "：baking");
    }

    public void cut() {
        System.out.println(name + "：cutting");
    }

    public void box() {
        System.out.println(name + "：cutting");
    }
}
