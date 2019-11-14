package com.sen.design.pattern.singleton;

/**
 * @Auther: Sen
 * @Date: 2019/11/14 19:09
 * @Description: 懒汉式（线程安全,双重检查）
 * 优点：实现懒加载，解决线程安全的多次同步所带来的效率问题
 */
public class SingletonType7 {

    public static void main(String[] args) {
        Singleton7 instance = Singleton7.getInstance();
        Singleton7 instance2 = Singleton7.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance:" + instance.hashCode());
        System.out.println("instance2:" + instance2.hashCode());
    }
}

class Singleton7 {
    private Singleton7() {

    }

    private static class Singleton {
        private static final Singleton7 instance = new Singleton7();
    }

    public static Singleton7 getInstance() {
        return Singleton.instance;
    }
}
