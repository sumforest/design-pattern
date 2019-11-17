package com.sen.design.pattern.interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: Sen
 * @Date: 2019/11/17 18:08
 * @Description: 解释器模式
 */
public class Client {

    public static void main(String[] args) throws IOException {
        String expr = getExpr();
        Map<String, Integer> var = getVar(expr);
        Calculator calculator = new Calculator();
        calculator.createExpression(expr);
        int calculate = calculator.calculate(var);
        System.out.println(calculate);
    }

    public static String  getExpr() {
        System.out.println("请输入表达式");
        try {
            return   new BufferedReader(new InputStreamReader(System.in)).readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Map<String,Integer> getVar(String expr) throws IOException {
        Map<String, Integer> var = new HashMap<>();
        char[] chars = expr.toCharArray();
        for (char ex : chars) {
            if (!String.valueOf(ex).equals("+") && !String.valueOf(ex).equals("-")) {
                System.out.println(String.valueOf(ex) + "的值");
                String num = new BufferedReader(new InputStreamReader(System.in)).readLine();
                var.put(String.valueOf(ex), Integer.parseInt(num));
            }
        }
        return var;
    }

}
