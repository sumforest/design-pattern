package com.sen.design.pattern.visitor;

/**
 * @Auther: Sen
 * @Date: 2019/11/16 19:31
 * @Description:
 */
public class Woman extends Person {
    @Override
    public void accept(Action action) {
        action.getWomenResult(this);
    }
}
