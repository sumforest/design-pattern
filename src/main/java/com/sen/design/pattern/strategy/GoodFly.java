package com.sen.design.pattern.strategy;

/**
 * @Auther: Sen
 * @Date: 2019/11/17 22:22
 * @Description:
 */
public class GoodFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("此鸭子擅长飞行");
    }
}
