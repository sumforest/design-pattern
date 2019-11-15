package com.sen.design.pattern.decorator;

/**
 * @Auther: Sen
 * @Date: 2019/11/15 19:43
 * @Description: 装饰者设计模式
 */
public class Client {

    public static void main(String[] args) {
        Drink longBlackCoffee = new LongBlackCoffee();
        System.out.println(longBlackCoffee.getDescribe());
        System.out.println(longBlackCoffee.cost());
        //加牛奶
        longBlackCoffee = new Mike(longBlackCoffee);
        System.out.println(longBlackCoffee.getDescribe());
        System.out.println(longBlackCoffee.cost());
        //加巧克力
        longBlackCoffee = new Chocolate(longBlackCoffee);
        System.out.println(longBlackCoffee.getDescribe());
        System.out.println(longBlackCoffee.cost());
        //加巧克力
        longBlackCoffee = new Chocolate(longBlackCoffee);
        System.out.println(longBlackCoffee.getDescribe());
        System.out.println(longBlackCoffee.cost());

        //无因咖啡
        Decaf decaf = new Decaf();
        Soy soy = new Soy(decaf);
        System.out.println(soy.getDescribe());
        System.out.println(soy.cost());
    }
}
