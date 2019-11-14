package com.sen.design.pattern.facotry.simplefactory.pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Auther: Sen
 * @Date: 2019/11/14 23:21
 * @Description:
 */
public class PizzaStore {

    PizzaStore(SimpleFactory simpleFactory) {
        do {
            System.out.println("请输入所要订购的种类");
            String pizzaType = getPizzaType();
            Pizza pizza = simpleFactory.makePizza(pizzaType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.bake();
            }else {
                System.out.println("订购披萨失败");
                break;
            }
        } while (true);
    }
    private String getPizzaType() {
        String type = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            type = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return type;
    }
}
