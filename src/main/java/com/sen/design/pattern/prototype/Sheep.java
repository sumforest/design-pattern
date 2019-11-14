package com.sen.design.pattern.prototype;

/**
 * @Auther: Sen
 * @Date: 2019/11/15 02:08
 * @Description:
 */
public class Sheep implements Cloneable{
    private int age;
    private String color;
    private String name;
    private String area = "蒙古羊";
    public Sheep friend;

    public Sheep() {
    }

    public Sheep(int age, String color, String name) {
        this.age = age;
        this.color = color;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "age=" + age +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", area='" + area + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return  super.clone();
    }
}
