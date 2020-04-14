package com.sen.design.pattern.adaptor.objectadaptor;

/**
 * @Auther: Sen
 * @Date: 2019/11/15 15:57
 * @Description: 适配器模式--对象适配
 * 把继承关系，变更未聚合关系，利用合成复用原则。
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("=====对象适配器===");
        Phone phone = new Phone();
        phone.charging(new Adaptor(new Voltage()));
    }
}
