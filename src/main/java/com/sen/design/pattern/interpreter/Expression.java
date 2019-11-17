package com.sen.design.pattern.interpreter;

import java.util.Map;

/**
 * @Auther: Sen
 * @Date: 2019/11/17 17:42
 * @Description:
 */
public abstract class Expression {
    /**
     * 解释方法，计算
     * @param var
     * @return
     */
    protected abstract int interpreter(Map<String, Integer> var);

}
