package com.sen.design.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: Sen
 * @Date: 2019/11/16 01:34
 * @Description: 享元工厂
 */
public class FlyweightFactory {

    private Map<String, WebSite> pool = new HashMap<>();

    public WebSite getWebSite(String type) {
        if (!pool.containsKey(type)) {
            pool.put(type, new ConcreteWebsite(type));
        }
        return pool.get(type);
    }

    public int getType() {
        return pool.size();
    }
}
