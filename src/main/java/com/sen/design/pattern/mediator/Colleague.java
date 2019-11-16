package com.sen.design.pattern.mediator;

/**
 * @Auther: Sen
 * @Date: 2019/11/17 02:16
 * @Description:
 */
public abstract class Colleague {

    private Mediator mediator;

    public String name;

    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public abstract void sendMessage(int state);
}
