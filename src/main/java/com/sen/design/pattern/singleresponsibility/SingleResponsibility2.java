package com.sen.design.pattern.singleresponsibility;

/**
 * @Auther: Sen
 * @Date: 2019/11/13 23:18
 * @Description:单一职责言责
 */
public class SingleResponsibility2 {

    public static void main(String[] args) {
        Roadvehicle roadvehicle = new Roadvehicle();
        roadvehicle.run("汽车");
        Airvehicle airvehicle = new Airvehicle();
        airvehicle.run("飞机");
        Watervehicle watervehicle = new Watervehicle();
        watervehicle.run("轮船");
    }
}

/**
 * 1.遵守单一职责原则
 * 2.功能比较简单，创建了三个不同的类比较浪费资源
 */
class Roadvehicle{
    public void run(String vehicle) {
        System.out.println(vehicle+"正在路上跑");
    }
}

class Airvehicle {
    public void run(String vehicle) {
        System.out.println(vehicle+"正在天上飞");
    }
}

class Watervehicle{
    public void run(String vehicle) {
        System.out.println(vehicle+"正在水中运行");
    }
}
