package com.sen.design.pattern.facotry.methodfactory;

/**
 * @Auther: Sen
 * @Date: 2019/11/15 00:37
 * @Description:
 */
public class LDPizaaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        if ("cheese".equals(pizzaType)) {
            pizza = new BJCheesePizaa();
            pizza.setName("伦敦奶酪披萨");
        } else if ("pepper".equals(pizzaType)) {
            pizza = new BJCheesePizaa();
            pizza.setName("伦敦胡椒披萨");
        }
        return pizza;
    }
}
