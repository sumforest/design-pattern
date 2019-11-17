package com.sen.design.pattern.strategy;

/**
 * @Auther: Sen
 * @Date: 2019/11/17 22:28
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        WildDuck wildDuck = new WildDuck();
        wildDuck.display();
        wildDuck.fly();

        ToyDuck toyDuck = new ToyDuck();
        toyDuck.display();
        toyDuck.fly();

    }
}
