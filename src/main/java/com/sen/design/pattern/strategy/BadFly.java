package com.sen.design.pattern.strategy;

/**
 * @Auther: Sen
 * @Date: 2019/11/17 22:22
 * @Description:
 */
public class BadFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("此鸭子飞的一般般");
    }
}
