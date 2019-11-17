package com.sen.design.pattern.memento;

/**
 * @Auther: Sen
 * @Date: 2019/11/17 15:53
 * @Description: 原始对象
 */
public class Originator {

    private String state;

    public Originator(String state) {
        this.state = state;
    }

    /**
     * 保存原始对象状态到备忘录对象
     * @param state
     * @return
     */
    public Memento saveOrigiState(String state) {
        return new Memento(state);
    }

    /**
     * 原始对象从备忘录对象回复到保存时状态
     * @param mementor
     */
    public void getOrigiState(Memento mementor) {
        this.setState(mementor.getState());
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
