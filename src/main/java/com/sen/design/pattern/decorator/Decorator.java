package com.sen.design.pattern.decorator;

import java.math.BigDecimal;

/**
 * @Auther: Sen
 * @Date: 2019/11/15 19:34
 * @Description: 装饰者
 */
public class Decorator extends Drink{

    private Drink obj;

    public Decorator(Drink obj) {
        this.obj = obj;
    }

    @Override
    protected BigDecimal cost() {
        //获取自身的价格和被装饰着的价格
        return super.getPrice().add(obj.cost());
    }

    @Override
    public void setDescribe(String describe) {
        super.setDescribe(obj.getDescribe() + describe);
    }
}
