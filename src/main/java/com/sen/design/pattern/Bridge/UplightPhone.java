package com.sen.design.pattern.Bridge;

/**
 * @Auther: Sen
 * @Date: 2019/11/15 18:20
 * @Description: 抽象类子类
 */
public class UplightPhone extends Phone {
    public UplightPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        System.out.println("直板");
        super.open();
    }

    @Override
    protected void call() {
        System.out.println("直板");
        super.call();
    }

    @Override
    protected void close() {
        System.out.println("直板");
        super.close();
    }
}
