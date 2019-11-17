package com.sen.design.pattern.interpreter;

import java.util.Map;

/**
 * @Auther: Sen
 * @Date: 2019/11/17 17:45
 * @Description: 常量类
 */
public class VarExpression extends Expression {
    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    @Override
    protected int interpreter(Map<String, Integer> var) {
        return var.get(this.key);
    }
}
