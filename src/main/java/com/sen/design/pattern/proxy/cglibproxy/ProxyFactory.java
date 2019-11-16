package com.sen.design.pattern.proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import java.lang.reflect.Method;

/**
 * @Auther: Sen
 * @Date: 2019/11/16 15:45
 * @Description:
 */
public class ProxyFactory implements MethodInterceptor {
    /**
     * 被代理对象
     */
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * 返回代理对象
     * @return
     */
    public Object getProxyInstance() {
        //创建工具类
        Enhancer enhancer = new Enhancer();
        //设置被代理对象
        enhancer.setSuperclass(target.getClass());
        //设置回调函数
        enhancer.setCallback(this);
        //返回代理对象
        return enhancer.create();
    }

    /**
     * 增强方法
     * @param o
     * @param method 被代理的方法
     * @param objects 被代理方法的方法参数
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib代理开始。。。。。");
        //执行被代理对象并返回被代理方法的返回值
        Object object = method.invoke(target, objects);
        System.out.println("cglib代理结束。。。。。");
        return object;

    }
}
