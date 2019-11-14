package com.sen.design.pattern.uml.composition;

/**
 * @Auther: Sen
 * @Date: 2019/11/14 17:18
 * @Description: 组合关系:不可分割
 */
public class Computer {
    private Mouse mouse = new Mouse();

    private Monitor monitor = new Monitor();
}
