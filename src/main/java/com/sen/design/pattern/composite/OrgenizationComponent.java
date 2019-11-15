package com.sen.design.pattern.composite;

/**
 * @Auther: Sen
 * @Date: 2019/11/15 22:45
 * @Description: 组织机构
 */
public abstract class OrgenizationComponent {

    protected String name;
    protected String dec;

    public OrgenizationComponent(String name, String dec) {
        this.name = name;
        this.dec = dec;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDec() {
        return dec;
    }

    public void setDec(String dec) {
        this.dec = dec;
    }

    protected void add(OrgenizationComponent component) {

    }

    protected void remove(OrgenizationComponent component) {

    }

    protected abstract void print();
}
