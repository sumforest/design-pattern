package com.sen.design.pattern.proxy.staticproxy;

/**
 * @Auther: Sen
 * @Date: 2019/11/16 02:26
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        //创建被代理对象
        TeacherDao target = new TeacherDao();
        //创建代理类，传入被代理对象
        TeacherProxy teacherProxy = new TeacherProxy(target);
        //执行代理方法
        teacherProxy.teach();

    }
}
