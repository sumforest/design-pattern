package com.sen.design.pattern.visitor;

/**
 * @Auther: Sen
 * @Date: 2019/11/16 19:33
 * @Description:
 */
public class Fail extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("男人：失败");
    }

    @Override
    public void getWomenResult(Woman woman) {
        System.out.println("女人:失败");
    }
}
