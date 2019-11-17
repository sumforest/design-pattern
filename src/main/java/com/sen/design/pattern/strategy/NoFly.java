package com.sen.design.pattern.strategy;

/**
 * @Auther: Sen
 * @Date: 2019/11/17 22:21
 * @Description:
 */
public class NoFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("此鸭子不能飞");
    }
}
