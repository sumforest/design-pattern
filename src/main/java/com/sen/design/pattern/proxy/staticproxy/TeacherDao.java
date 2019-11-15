package com.sen.design.pattern.proxy.staticproxy;

/**
 * @Auther: Sen
 * @Date: 2019/11/16 02:23
 * @Description: 被代理对象
 */
public class TeacherDao implements Itearcher {
    @Override
    public void teach() {
        System.out.println("韩老师正在授课");
    }
}
