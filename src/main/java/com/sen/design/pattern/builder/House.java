package com.sen.design.pattern.builder;

/**
 * @Auther: Sen
 * @Date: 2019/11/15 14:44
 * @Description: 建造者模式：product
 */
public class House {
    private String basic;
    private String wall;
    private String hight;

    public String getBasic() {
        return basic;
    }

    public void setBasic(String basic) {
        this.basic = basic;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getHight() {
        return hight;
    }

    public void setHight(String hight) {
        this.hight = hight;
    }
}
