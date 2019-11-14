package com.sen.design.pattern.facotry.methodfactory;


/**
 * @Auther: Sen
 * @Date: 2019/11/15 00:07
 * @Description:
 */
public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备材料制作伦敦胡椒披萨");
    }
}
