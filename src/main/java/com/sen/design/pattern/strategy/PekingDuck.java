package com.sen.design.pattern.strategy;

/**
 * @Auther: Sen
 * @Date: 2019/11/17 22:26
 * @Description:
 */
public class PekingDuck extends Duck {
    public PekingDuck() {
        this.flyBehavior = new BadFly();
    }

    @Override
    public void display() {
        System.out.println("北京鸭子");
    }
}
