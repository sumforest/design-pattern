package com.sen.design.pattern.decorator;

import java.math.BigDecimal;

/**
 * @Auther: Sen
 * @Date: 2019/11/15 19:30
 * @Description:
 */
public abstract class Coffee extends Drink {

    @Override
    protected BigDecimal cost() {
        return super.getPrice();
    }
}
