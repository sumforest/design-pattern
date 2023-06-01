package com.sen.design.pattern.proxy.dynamicproxy;

/**
 * @Auther: Sen
 * @Date: 2019/11/16 03:04
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        //创建被代理对象（目标对象）
        Itearcher teacherDao = new TeacherDao();
        //创建代理对象工厂
        ProxyFactory proxyFactory = new ProxyFactory(teacherDao);

        //创建代理对象
        Itearcher proxyInstance = (Itearcher) proxyFactory.getProxyInstance();
        proxyInstance.teach();
    }
}
