package com.sen.design.pattern.adaptor.classadaptor;

/**
 * @Auther: Sen
 * @Date: 2019/11/15 15:57
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new Adaptor());
    }
}
