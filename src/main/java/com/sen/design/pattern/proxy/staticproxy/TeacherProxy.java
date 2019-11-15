package com.sen.design.pattern.proxy.staticproxy;

/**
 * @Auther: Sen
 * @Date: 2019/11/16 02:24
 * @Description: 代理对象
 */
public class TeacherProxy implements Itearcher {
    //聚合被代理对象
    private Itearcher itearcher;

    public TeacherProxy(Itearcher itearcher) {
        this.itearcher = itearcher;
    }

    /**
     * 创建代理方法
     */
    @Override
    public void teach() {
        System.out.println("代理前正在执行某些功能。。。。");
        itearcher.teach();
        System.out.println("代理后正在关闭资源.....");
    }
}
