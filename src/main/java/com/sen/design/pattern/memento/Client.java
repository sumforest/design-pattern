package com.sen.design.pattern.memento;

import javax.swing.*;

/**
 * @Auther: Sen
 * @Date: 2019/11/17 16:01
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        Originator originator = new Originator("状态1：攻击力100");
        Caretaker caretaker = new Caretaker();

        System.out.println(originator.getState());
        caretaker.add(originator.saveOrigiState(originator.getState()));

        originator.setState("状态2：攻击力80");
        System.out.println(originator.getState());
        caretaker.add(originator.saveOrigiState(originator.getState()));

        originator.setState("状态3：攻击力10");
        System.out.println(originator.getState());
        caretaker.add(originator.saveOrigiState(originator.getState()));

        System.out.println("恢复状态二：");
        originator.getOrigiState(caretaker.getMemento(1));
        System.out.println(originator.getState());
    }
}
