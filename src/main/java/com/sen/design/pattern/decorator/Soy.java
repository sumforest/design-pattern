package com.sen.design.pattern.decorator;

import java.math.BigDecimal;

/**
 * @Auther: Sen
 * @Date: 2019/11/15 19:39
 * @Description:
 */
public class Soy extends Decorator {
    public Soy(Drink obj) {
        super(obj);
        super.setDescribe("豆浆");
        super.setPrice(new BigDecimal("1.5"));
    }
}
