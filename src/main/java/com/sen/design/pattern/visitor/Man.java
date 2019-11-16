package com.sen.design.pattern.visitor;

/**
 * @Auther: Sen
 * @Date: 2019/11/16 19:31
 * @Description: 双分派
 */
public class Man extends Person {

    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
