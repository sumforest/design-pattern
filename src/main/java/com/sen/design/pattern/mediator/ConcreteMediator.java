package com.sen.design.pattern.mediator;


import com.sen.design.pattern.decorator.Coffee;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: Sen
 * @Date: 2019/11/17 02:19
 * @Description:
 */
public class ConcreteMediator extends Mediator {
    private Map<String, Colleague> colleagues;

    public ConcreteMediator() {
        colleagues = new HashMap<>();
    }

    @Override

    public void register(String colleageName, Colleague colleague) {
        colleagues.put(colleageName, colleague);
    }

    @Override
    public void getMessage(int state, String colleagueName) {
        Colleague colleague = colleagues.get(colleagueName);
        if (colleague instanceof Alarm) {
            Alarm alarm = (Alarm) colleague;
            if (state == 1) {
                ((TV)(colleagues.get("tv"))).on();
                ((CoffeeMachine)(colleagues.get("coffeeMachine"))).open();
            }
        } else if (colleague instanceof CoffeeMachine) {

        } else if (colleague instanceof TV) {
            if (state == 1) {
                ((CoffeeMachine)(colleagues.get("coffeeMachine"))).stop();
            }
        }
    }

    @Override
    public void sendMessage(int state, String colleagueName) {

    }
}
