package com.sen.design.pattern.memento.game;

import java.util.List;
import java.util.Map;

/**
 * @Auther: Sen
 * @Date: 2019/11/17 16:21
 * @Description: 守护者对象
 */
public class Caretaker {
    //保存单个角色的单个状态
    private Memento memento;
    //保存单个角色的多个状态
    // private List<Memento> mementos;
    //保存多个角色的多个状态
    // private Map<String, List<Memento>> rolesMements;

    public void saveMemento(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return this.memento;
    }
}
