package com.sen.design.pattern.strategy;

/**
 * @Auther: Sen
 * @Date: 2019/11/17 22:23
 * @Description:
 */
public abstract class Duck {

    protected FlyBehavior flyBehavior;

    public abstract void display();

    public void swin() {
        System.out.println("鸭子正在游泳");
    }

    public void fly() {
        flyBehavior.fly();
    }

}
