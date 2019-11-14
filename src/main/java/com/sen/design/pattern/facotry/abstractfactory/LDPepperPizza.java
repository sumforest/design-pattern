package com.sen.design.pattern.facotry.abstractfactory;

/**
 * @Auther: Sen
 * @Date: 2019/11/15 00:07
 * @Description:
 */
public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        this.name = "伦敦胡椒披萨";
        System.out.println("准备材料制作伦敦胡椒披萨");
    }
}
