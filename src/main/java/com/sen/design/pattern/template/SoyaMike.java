package com.sen.design.pattern.template;

/**
 * @Auther: Sen
 * @Date: 2019/11/16 16:38
 * @Description: 模板类
 */
public abstract class SoyaMike {

    /**
     * 模板方法（算法的骨架）
     */
    protected final void make() {
        select();
        addMaterial();
        soak();
        beat();
    }

    /**
     * 需要被具体子类事项的具体方法
     */
    protected abstract void addMaterial();

    protected final void soak() {
        System.out.println("第三步：将黄豆浸泡数个小时");
    }

    protected final void select() {
        System.out.println("第一步：选择上好的黄豆");
    }

    protected final void beat() {
        System.out.println("第四步：将黄豆打碎");
    }
}
