package com.sen.design.pattern.mediator;

/**
 * @Auther: Sen
 * @Date: 2019/11/17 02:36
 * @Description:
 */
public class TV extends Colleague {
    public TV(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    @Override
    public void sendMessage(int state) {
        this.getMediator().getMessage(state, this.name);
    }

    public void on() {
        System.out.println("tv 已打开");
    }

    public void off() {
        System.out.println("tv 已停止");
    }
}
