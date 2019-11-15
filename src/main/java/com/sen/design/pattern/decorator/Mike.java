package com.sen.design.pattern.decorator;

import java.math.BigDecimal;

/**
 * @Auther: Sen
 * @Date: 2019/11/15 19:39
 * @Description:
 */
public class Mike extends Decorator {
    public Mike(Drink obj) {
        super(obj);
        super.setDescribe("牛奶");
        super.setPrice(new BigDecimal("2.0"));
    }
}
