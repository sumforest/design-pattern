package com.sen.design.pattern.singleton;

/**
 * @Auther: Sen
 * @Date: 2019/11/14 18:43
 * @Description: 饿汉式（静态代码块）
 * 优点：在类加载机制上实现了线程安全
 * 缺点：无法实现lazy loading，在不确定是否使用该对象的时候会造成内存浪费。
 */
public class SingletonType2 {

    public static void main(String[] args) {
        Singleton2 instance = Singleton2.getInstance();
        Singleton2 instance2 = Singleton2.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance:" + instance.hashCode());
        System.out.println("instance2:" + instance2.hashCode());
    }
}

class Singleton2{
    //私有化构造方法，防止new
    private Singleton2(){

    }

    //定义静态变量直接new
    private static Singleton2 instance ;

    static {
        instance = new Singleton2();
    }

    public static Singleton2 getInstance(){
        return instance;
    }
}
