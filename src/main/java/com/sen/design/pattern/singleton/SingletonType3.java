package com.sen.design.pattern.singleton;

/**
 * @Auther: Sen
 * @Date: 2019/11/14 19:09
 * @Description: 懒汉式（线程不安全）
 * 优点:实现了懒加载
 * 缺点：在多线程的环境下线程不安全，有可能创建多个实例
 */
public class SingletonType3 {

    public static void main(String[] args) {
        Singleton3 instance = Singleton3.getInstance();
        Singleton3 instance2 = Singleton3.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance:" + instance.hashCode());
        System.out.println("instance2:" + instance2.hashCode());
    }
}

class Singleton3 {
    private Singleton3() {

    }

    private static Singleton3 instance;

    public static Singleton3 getInstance() {
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }
}
