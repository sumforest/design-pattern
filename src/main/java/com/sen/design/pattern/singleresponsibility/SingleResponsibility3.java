package com.sen.design.pattern.singleresponsibility;

/**
 * @Auther: Sen
 * @Date: 2019/11/13 23:18
 * @Description:单一职责言责
 */
public class SingleResponsibility3 {

    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.runOnRoad("汽车");
        vehicle2.runOnAir("飞机");
        vehicle2.runOnWater("轮船");
    }
}

/**
 * 1.在类的级别上违反了单一职责原则
 * 2.在功能比较简单的请况下在方法级别上遵循了单一职责原则，节省资源
 */
class Vehicle2 {
    public void runOnRoad(String vehicle) {
        System.out.println(vehicle + "正在路上跑");
    }

    public void runOnAir(String vehicle) {
        System.out.println(vehicle + "正在天上飞");
    }

    public void runOnWater(String vehicle) {
        System.out.println(vehicle + "正在水中运行");
    }
}
