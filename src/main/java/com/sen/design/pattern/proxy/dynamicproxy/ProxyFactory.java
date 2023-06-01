package com.sen.design.pattern.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Auther: Sen
 * @Date: 2019/11/16 02:56
 * @Description: 动态代理工厂
 */
public class ProxyFactory {

    /**
     * 被代理对象
     */
    private Itearcher target;

    public ProxyFactory(Itearcher teacherDao) {
        this.target =  teacherDao;
    }


    public Object getProxyInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), new InvocationHandler() {
                    /**
                     * 以内部类的形式实现invocationHandler接口
                     * @param proxy 代理对象
                     * @param method 被代理对象方法
                     * @param args 被代理对象的方法参数
                     * @return
                     * @throws Throwable
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("JDK动态代理开始。。。。。。");
                        Object obj = method.invoke(target, args);
                        System.out.println("JDK动态代理结束........");
                        return obj;
                    }
                });
    }
}
