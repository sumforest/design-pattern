package com.sen.design.pattern.Bridge;

/**
 * @Auther: Sen
 * @Date: 2019/11/15 18:17
 * @Description: 桥接模式：桥接类
 */
public abstract class Phone {
    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    protected void open() {
        brand.open();
    }

    protected void call() {
        brand.call();
    }

    protected void close() {
        brand.close();
    }
}
