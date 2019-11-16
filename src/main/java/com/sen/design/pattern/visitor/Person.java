package com.sen.design.pattern.visitor;

/**
 * @Auther: Sen
 * @Date: 2019/11/16 19:31
 * @Description:
 */
public abstract class Person {
    public abstract void accept(Action action);
}
