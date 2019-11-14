package com.sen.design.pattern.facotry.simplefactory.pizza;

/**
 * @Auther: Sen
 * @Date: 2019/11/14 23:59
 * @Description: 简单工厂类
 */
public class SimpleFactory {

    public Pizza makePizza(String pizzaType) {
        Pizza pizza = null;
        if ("greek".equals(pizzaType)) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if ("cheese".equals(pizzaType)) {
            pizza = new CheesePizaa();
            pizza.setName("奶酪披萨");
        } else if ("pepper".equals(pizzaType)) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }
        return pizza;
    }
}
