package com.sen.design.pattern.strategy;

/**
 * @Auther: Sen
 * @Date: 2019/11/17 22:23
 * @Description: 策略模式鸭子有多种飞行方式
 */
public abstract class Duck {

    /**
     *聚合策略接口
     */
    protected FlyBehavior flyBehavior;

    public abstract void display();

    public void swin() {
        System.out.println("鸭子正在游泳");
    }

    public void fly() {
        flyBehavior.fly();
    }

}
