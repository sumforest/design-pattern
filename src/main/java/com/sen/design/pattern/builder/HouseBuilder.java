package com.sen.design.pattern.builder;

/**
 * @Auther: Sen
 * @Date: 2019/11/15 14:46
 * @Description: 建造者模式：抽象建造者
 */
public abstract class HouseBuilder {
    private House house = new House();
    public abstract void buildBasic();

    public abstract void buildWall();

    public abstract void roofed();

    public House buildHouse() {
        return house;
    }
}
