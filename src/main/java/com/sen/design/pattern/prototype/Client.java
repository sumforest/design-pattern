package com.sen.design.pattern.prototype;

/**
 * @Auther: Sen
 * @Date: 2019/11/15 02:12
 * @Description: 圆形模式与浅拷贝
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep(1, "白色", "tom");
        Sheep friend = new Sheep(2, "黑色", "cat");
        sheep.friend = friend;
        Sheep clone2 = (Sheep) sheep.clone();
        Sheep clone3 = (Sheep) sheep.clone();
        Sheep clone4 = (Sheep) sheep.clone();
        Sheep clone5 = (Sheep) sheep.clone();
        System.out.println("clone2:"+clone2+"friend2:"+clone2.friend.hashCode());
        System.out.println("clone3:"+clone3+"friend3:"+clone3.friend.hashCode());
        System.out.println("clone4:"+clone4+"friend4:"+clone4.friend.hashCode());
        System.out.println("clone5:"+clone5+"friend5:"+clone5.friend.hashCode());
    }
}
