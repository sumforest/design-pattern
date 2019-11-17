package com.sen.design.pattern.memento.game;

/**
 * @Auther: Sen
 * @Date: 2019/11/17 16:29
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        Gamer gamer = new Gamer(100, 100);
        gamer.display();
        Memento memento = gamer.saveState();

        System.out.println("大战开始");
        gamer.setDef(30);
        gamer.setVit(30);
        gamer.display();

        System.out.println("大战结束");
        gamer.recoverState(memento);
        gamer.display();
    }
}
