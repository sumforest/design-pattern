package com.sen.design.pattern.flyweight;

/**
 * @Auther: Sen
 * @Date: 2019/11/16 01:38
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        WebSite news = factory.getWebSite("新闻");
        news.use(new User("康辉"));
        WebSite weibo1 = factory.getWebSite("微博");
        WebSite weibo2 = factory.getWebSite("微博");
        WebSite weibo3 = factory.getWebSite("微博");
        weibo1.use(new User("李小璐"));

        System.out.println(factory.getType());
    }
}
