package com.sen.design.pattern.memento.game;

/**
 * @Auther: Sen
 * @Date: 2019/11/17 16:20
 * @Description:
 */
public class Memento {

    private int vit;

    private int def;

    public Memento(int vit, int def) {
        this.vit = vit;
        this.def = def;
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
