package com.sen.design.pattern.singleton;

/**
 * @Auther: Sen
 * @Date: 2019/11/14 19:09
 * @Description: 懒汉式（线程安全）
 * 优点:实现了懒加载,并且线程安全
 * 缺点：实现线程安全是为了避免在instance实例还没有创建的时候创建多个实例，而加锁之后每一次获取instance都得同步，
 * 导致在并发环境下性能太低。
 */
public class SingletonType4 {

    public static void main(String[] args) {
        Singleton4 instance = Singleton4.getInstance();
        Singleton4 instance2 = Singleton4.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance:" + instance.hashCode());
        System.out.println("instance2:" + instance2.hashCode());
    }
}

class Singleton4 {
    private Singleton4() {

    }

    private static Singleton4 instance;

    public  static synchronized Singleton4 getInstance() {
        if (instance == null) {
            instance = new Singleton4();
        }
        return instance;
    }
}
