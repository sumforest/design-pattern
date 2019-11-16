package com.sen.design.pattern.mediator;



/**
 * @Auther: Sen
 * @Date: 2019/11/17 02:14
 * @Description:
 */
public abstract class Mediator {

    public abstract void register(String colleageName, Colleague colleague);

    public abstract void getMessage(int state, String colleagueName);

    public abstract void sendMessage(int state, String colleagueName);
}
