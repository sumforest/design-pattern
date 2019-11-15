package com.sen.design.pattern.flyweight;

/**
 * @Auther: Sen
 * @Date: 2019/11/16 01:28
 * @Description: 抽象享元角色
 */
public abstract class WebSite {
    protected String type;

    public WebSite(String type) {
        this.type = type;
    }

    public abstract void use(User user);
}
