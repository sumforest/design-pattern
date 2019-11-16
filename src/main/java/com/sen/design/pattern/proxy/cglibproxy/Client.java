package com.sen.design.pattern.proxy.cglibproxy;

/**
 * @Auther: Sen
 * @Date: 2019/11/16 15:52
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        //创建被代理对象
        TeacherDao teacherDao = new TeacherDao();
        //创建代理对象工厂，并生成代理类
        ProxyFactory factory = new ProxyFactory(teacherDao);
        TeacherDao proxyInstance = (TeacherDao) factory.getProxyInstance();
        //执行代理类的代理方法
        proxyInstance.teach();
    }
}
