package com.sen.design.pattern.facotry.simplefactory.pizza;

/**
 * @Auther: Sen
 * @Date: 2019/11/14 23:21
 * @Description:
 */
public class CheesePizaa extends Pizza {
    @Override
    public void prepare() {
        System.out.println("正在准备原材料制作奶酪披萨");
    }
}
