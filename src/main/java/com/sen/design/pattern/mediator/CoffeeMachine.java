package com.sen.design.pattern.mediator;

/**
 * @Auther: Sen
 * @Date: 2019/11/17 02:34
 * @Description:
 */
public class CoffeeMachine extends Colleague {
    public CoffeeMachine(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    @Override
    public void sendMessage(int state) {
        this.getMediator().getMessage(state, this.name);
    }

    public void open() {
        System.out.println("咖啡加已开启");
    }

    public void stop() {
        System.out.println("咖啡机已停止");
    }
}
