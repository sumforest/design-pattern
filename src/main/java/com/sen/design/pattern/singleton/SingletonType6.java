package com.sen.design.pattern.singleton;

/**
 * @Auther: Sen
 * @Date: 2019/11/14 19:09
 * @Description: 懒汉式（线程安全,双重检查）
 * 优点：实现懒加载，解决线程安全的多次同步所带来的效率问题
 */
public class SingletonType6 {

    public static void main(String[] args) {
        Singleton6 instance = Singleton6.getInstance();
        Singleton6 instance2 = Singleton6.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance:" + instance.hashCode());
        System.out.println("instance2:" + instance2.hashCode());
    }
}

class Singleton6 {
    private Singleton6() {

    }

    private static volatile Singleton6 instance;

    public  static Singleton6 getInstance() {
        if (instance == null) {
            synchronized (Singleton6.class) {
                if (instance == null) {
                    instance = new Singleton6();
                }
            }
        }
        return instance;
    }
}
