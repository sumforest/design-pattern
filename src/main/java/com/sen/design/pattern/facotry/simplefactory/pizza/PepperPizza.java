package com.sen.design.pattern.facotry.simplefactory.pizza;

/**
 * @Auther: Sen
 * @Date: 2019/11/15 00:07
 * @Description:
 */
public class PepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备材料制作胡椒披萨");
    }
}
