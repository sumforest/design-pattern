package com.sen.design.pattern.mediator;

/**
 * @Auther: Sen
 * @Date: 2019/11/17 02:30
 * @Description:
 */
public class Alarm extends Colleague {

    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    @Override
    public void sendMessage(int state) {
        this.getMediator().getMessage(state, this.name);
    }
}
