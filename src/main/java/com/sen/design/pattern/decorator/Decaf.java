package com.sen.design.pattern.decorator;

import java.math.BigDecimal;

/**
 * @Auther: Sen
 * @Date: 2019/11/15 20:09
 * @Description:
 */
public class Decaf extends Coffee {
    public Decaf() {
        super.setDescribe("无因咖啡");
        super.setPrice(new BigDecimal("10"));
    }
}
