package com.sen.design.pattern.mediator;

/**
 * @Auther: Sen
 * @Date: 2019/11/17 02:49
 * @Description: 中介模式
 */
public class Client {

    public static void main(String[] args) {
        Mediator concreteMediator = new ConcreteMediator();
        Alarm alarm = new Alarm(concreteMediator, "alarm");
        CoffeeMachine machine = new CoffeeMachine(concreteMediator, "coffeeMachine");
        TV tv = new TV(concreteMediator, "tv");
        alarm.sendMessage(1);
        tv.sendMessage(1);
    }
}
