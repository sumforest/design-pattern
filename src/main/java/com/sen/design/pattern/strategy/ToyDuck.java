package com.sen.design.pattern.strategy;

/**
 * @Auther: Sen
 * @Date: 2019/11/17 22:27
 * @Description:
 */
public class ToyDuck extends Duck {
    public ToyDuck() {
        this.flyBehavior = new NoFly();
    }

    @Override
    public void display() {
        System.out.println("玩具鸭");
    }
}
