package com.sen.design.pattern.facotry.abstractfactory;

/**
 * @Auther: Sen
 * @Date: 2019/11/15 01:11
 * @Description: 抽象像工厂子工厂
 */
public class BJFactory implements AbstractFactory {
    @Override
    public Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        if ("cheese".equals(pizzaType)) {
            pizza = new BJCheesePizaa();
        } else if ("pepper".equals(pizzaType)) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
