package com.sen.design.pattern.inversion.improve;

/**
 * @Auther: Sen
 * @Date: 2019/11/14 01:00
 * @Description: 依赖倒置原则
 */
public class DependencyInversion {

    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeChat());

    }
}

interface Message {
    void message();
}

class Email implements Message{

    @Override
    public void message() {
        System.out.println("hello email");
    }
}

class WeChat implements Message{
    @Override
    public void message() {
        System.out.println("hello wechat");
    }
}

class Person {
    void receive(Message message) {
        message.message();
    }
}