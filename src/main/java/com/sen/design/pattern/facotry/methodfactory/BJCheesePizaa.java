package com.sen.design.pattern.facotry.methodfactory;


/**
 * @Auther: Sen
 * @Date: 2019/11/14 23:21
 * @Description:
 */
public class BJCheesePizaa extends Pizza {
    @Override
    public void prepare() {
        System.out.println("正在准备原材料制作北京奶酪披萨");
    }
}
