package com.sen.design.pattern.facotry.simplefactory.pizza;

/**
 * @Auther: Sen
 * @Date: 2019/11/14 23:20
 * @Description:
 */
public class GreekPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("正在整备制作希腊披萨的材料");
    }
}
