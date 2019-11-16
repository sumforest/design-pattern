package com.sen.design.pattern.visitor;

/**
 * @Auther: Sen
 * @Date: 2019/11/16 19:32
 * @Description:
 */
public class Success extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("男人：成功");
    }

    @Override
    public void getWomenResult(Woman woman) {
        System.out.println("女人:成功");
    }
}
