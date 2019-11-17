package com.sen.design.pattern.memento;

/**
 * @Auther: Sen
 * @Date: 2019/11/17 15:54
 * @Description:
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
