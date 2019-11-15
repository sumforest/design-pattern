package com.sen.design.pattern.decorator;

import java.math.BigDecimal;

/**
 * @Auther: Sen
 * @Date: 2019/11/15 19:31
 * @Description:
 */
public class EspreesoCoffee extends Coffee {
    public EspreesoCoffee() {
        super.setDescribe("意大利咖啡");
        super.setPrice(new BigDecimal("5.0"));
    }
}
