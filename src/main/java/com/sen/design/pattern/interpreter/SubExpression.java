package com.sen.design.pattern.interpreter;

import java.util.Map;

/**
 * @Auther: Sen
 * @Date: 2019/11/17 17:53
 * @Description:
 */
public class SubExpression extends SymbolExpression {
    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * 计算两个数的差
     * @param var
     * @return
     */
    @Override
    protected int interpreter(Map<String, Integer> var) {
        return this.left.interpreter(var) - this.right.interpreter(var);
    }
}
