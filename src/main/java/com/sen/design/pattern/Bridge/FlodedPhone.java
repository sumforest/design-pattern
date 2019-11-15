package com.sen.design.pattern.Bridge;

/**
 * @Auther: Sen
 * @Date: 2019/11/15 18:20
 * @Description: 抽象类子类
 */
public class FlodedPhone extends Phone {
    public FlodedPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        System.out.println("折叠");
        super.open();
    }

    @Override
    protected void call() {
        System.out.println("折叠");
        super.call();
    }

    @Override
    protected void close() {
        System.out.println("折叠");
        super.close();
    }
}
