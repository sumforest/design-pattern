package com.sen.design.pattern.decorator;

import java.math.BigDecimal;

/**
 * @Auther: Sen
 * @Date: 2019/11/15 19:39
 * @Description:
 */
public class Chocolate extends Decorator {
    public Chocolate(Drink obj) {
        super(obj);
        super.setDescribe("巧克力");
        super.setPrice(new BigDecimal("3.0"));
    }
}
