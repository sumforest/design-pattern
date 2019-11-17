package com.sen.design.pattern.interpreter;

import java.util.Map;
import java.util.Stack;

/**
 * @Auther: Sen
 * @Date: 2019/11/17 17:54
 * @Description:
 */
public class Calculator {
    private Expression expression;

    public void createExpression(String expr) {
        char[] chars = expr.toCharArray();
        Stack<Expression> stack = new Stack<>();
        Expression left = null;
        Expression right = null;

        for (int i = 0; i < chars.length; i++) {
            char currentChar = chars[i];
            switch (currentChar) {
                case '+':
                     left = stack.pop();
                     right = new VarExpression(String.valueOf(chars[++i]));
                    AddExpression addExpression = new AddExpression(left, right);
                    stack.push(addExpression);
                    break;
                case '-':
                     left = stack.pop();
                     right = new VarExpression(String.valueOf(chars[++i]));
                    stack.push(new SubExpression(left, right));
                    break;
                default:
                    VarExpression varExpression = new VarExpression(String.valueOf(currentChar));
                    stack.push(varExpression);
                    break;
            }
        }
        this.expression = stack.pop();
    }

    public int calculate(Map<String, Integer> var) {
        return this.expression.interpreter(var);
    }
}
