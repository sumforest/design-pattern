package com.sen.design.pattern.strategy;

/**
 * @Auther: Sen
 * @Date: 2019/11/17 22:25
 * @Description:
 */
public class WildDuck extends Duck {

    public WildDuck() {
        this.flyBehavior = new GoodFly();
    }

    @Override
    public void display() {
        System.out.println("野生鸭子一只");
    }
}
