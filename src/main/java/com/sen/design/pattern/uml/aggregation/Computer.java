package com.sen.design.pattern.uml.aggregation;

/**
 * @Auther: Sen
 * @Date: 2019/11/14 17:18
 * @Description: 聚合关系：可分割
 */
public class Computer {
    private Mouse mouse;

    private Monitor monitor;

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}
