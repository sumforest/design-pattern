package com.sen.design.pattern.singleresponsibility;

/**
 * @Auther: Sen
 * @Date: 2019/11/13 23:18
 * @Description:单一职责言责
 */
public class SingleResponsibility1 {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.run("飞机");
    }
}

/**
 * 违反了单一职责原则
 */
class Vehicle{
    public void run(String vehicle) {
        System.out.println(vehicle+"正在路上跑");
    }
}
