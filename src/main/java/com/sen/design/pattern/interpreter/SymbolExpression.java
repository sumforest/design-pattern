package com.sen.design.pattern.interpreter;


/**
 * @Auther: Sen
 * @Date: 2019/11/17 17:48
 * @Description:
 */
public abstract class SymbolExpression extends Expression {
    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
