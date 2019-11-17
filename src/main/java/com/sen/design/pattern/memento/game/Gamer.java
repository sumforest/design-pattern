package com.sen.design.pattern.memento.game;

/**
 * @Auther: Sen
 * @Date: 2019/11/17 16:24
 * @Description:
 */
public class Gamer {

    private int vit;

    private int def;

    public Gamer(int vit, int def) {
        this.vit = vit;
        this.def = def;
    }

    /**
     * 保存当前状态
     * @return
     */
    public Memento saveState() {
        return new Memento(vit, def);
    }

    /**
     * 回复保存时状态
     * @param memento
     */
    public void recoverState(Memento memento) {
        this.vit = memento.getVit();
        this.def = memento.getDef();
    }

    public void display() {
        System.out.println("当前攻击力：" + vit + "当前防御力：" + def);
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
