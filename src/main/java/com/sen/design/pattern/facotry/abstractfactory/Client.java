package com.sen.design.pattern.facotry.abstractfactory;

import java.util.Calendar;

/**
 * @Auther: Sen
 * @Date: 2019/11/15 01:22
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("~抽象工厂~");
        // new PizzaStore(new BJFactory());
        // new PizzaStore(new LDFactory());
        Calendar instance = Calendar.getInstance();
    }
}
