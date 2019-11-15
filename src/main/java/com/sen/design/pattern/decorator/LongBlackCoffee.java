package com.sen.design.pattern.decorator;

import java.math.BigDecimal;

/**
 * @Auther: Sen
 * @Date: 2019/11/15 19:31
 * @Description:
 */
public class LongBlackCoffee extends Coffee {
    public LongBlackCoffee() {
        super.setDescribe("美式咖啡");
        super.setPrice(new BigDecimal("7.0"));
    }
}
