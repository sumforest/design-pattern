package com.sen.design.pattern.facade;

/**
 * @Auther: Sen
 * @Date: 2020/3/4 18:20
 * @Description:
 */
public class Popcorn {
    private static Popcorn instance = new Popcorn();


    public static Popcorn getInstance() {
        return instance;
    }


    public void on() {
        System.out.println(" popcorn on ");
    }

    public void off() {
        System.out.println(" popcorn ff ");
    }


    public void pop() {
        System.out.println(" popcorn is poping	");
    }

}
