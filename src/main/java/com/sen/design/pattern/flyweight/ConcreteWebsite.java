package com.sen.design.pattern.flyweight;

/**
 * @Auther: Sen
 * @Date: 2019/11/16 01:31
 * @Description: 具体享元角色（内部状态）
 */
public class ConcreteWebsite extends WebSite {
    public ConcreteWebsite(String type) {
        super(type);
    }

    @Override
    public void use(User user) {
        System.out.println("以" + this.type + "形式发布的网站正在运行，用户：" + user.getName() + "正在访问");
    }
}
