package com.sen.design.pattern.facotry.simplefactory.pizza;

/**
 * @Auther: Sen
 * @Date: 2019/11/14 23:34
 * @Description: 简单工厂
 */
public class Client {

    public static void main(String[] args) {
        // new PizzaStore();
        //使用简单工厂创建
        new PizzaStore(new SimpleFactory());
    }
}
