package com.sen.design.pattern.singleton;

/**
 * @Auther: Sen
 * @Date: 2019/11/14 19:09
 * @Description: 懒汉式（线程安全,同步代码块）
 * 缺点：完全没有实现线程安全
 */
public class SingletonType5 {

    public static void main(String[] args) {
        Singleton5 instance = Singleton5.getInstance();
        Singleton5 instance2 = Singleton5.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance:" + instance.hashCode());
        System.out.println("instance2:" + instance2.hashCode());
    }
}

class Singleton5 {
    private Singleton5() {

    }

    private static Singleton5 instance;

    public  static Singleton5 getInstance() {
        if (instance == null) {
            synchronized (Singleton5.class) {
                instance = new Singleton5();
            }
        }
        return instance;
    }
}
