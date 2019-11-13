package com.sen.design.pattern.inversion;

/**
 * @Auther: Sen
 * @Date: 2019/11/14 01:00
 * @Description: 依赖倒置原则
 */
public class DependencyInversion {

    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());

    }
}

class Email {
    public void message() {
        System.out.println("hello email");
    }
}

/**
 * 1.这中实现方法当接收的消息来自微信、qq等的时候得新建一个相应的微信、qq类同时person类中也得添加相应得方法
 * 2.使用依赖倒置原则得接口传递依赖关系进行修改
 */
class Person {
    public void receive(Email email) {
        email.message();
    }
}