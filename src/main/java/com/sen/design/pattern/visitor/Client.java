package com.sen.design.pattern.visitor;

/**
 * @Auther: Sen
 * @Date: 2019/11/16 19:36
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new Woman());
        objectStructure.attach(new Man());

        objectStructure.show(new Success());
        objectStructure.show(new Fail());
    }
}
