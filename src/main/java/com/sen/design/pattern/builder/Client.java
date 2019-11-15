package com.sen.design.pattern.builder;

/**
 * @Auther: Sen
 * @Date: 2019/11/15 14:59
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        Director director = new Director(new CommonHouseBuilder());
        director.buildHouse();
        System.out.println("===========================");
        director.setHouseBuilder(new HighHouseBuilder());
        director.buildHouse();
        StringBuilder stringBuilder = new StringBuilder("hello");
        System.out.println(stringBuilder);
    }
}
