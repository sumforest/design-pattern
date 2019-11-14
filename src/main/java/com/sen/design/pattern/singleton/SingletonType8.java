package com.sen.design.pattern.singleton;

/**
 * @Auther: Sen
 * @Date: 2019/11/14 22:43
 * @Description:
 */
public class SingletonType8 {

    public static void main(String[] args) {
        SingletonE instance = SingletonE.INSTANCE;
        SingletonE instance1 = SingletonE.INSTANCE;
        instance.getInstance();
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}

enum SingletonE{
    INSTANCE;
    public void getInstance() {
        System.out.println("枚举创建单例模式");
    }
}