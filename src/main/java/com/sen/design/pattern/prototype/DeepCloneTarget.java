package com.sen.design.pattern.prototype;

import java.io.Serializable;

/**
 * @Auther: Sen
 * @Date: 2019/11/15 02:52
 * @Description: 深拷贝目标类
 */
public class DeepCloneTarget implements Serializable,Cloneable{
    private String name;
    private String className;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public DeepCloneTarget(String name, String className) {
        this.name = name;
        this.className = className;
    }

    @Override
    public String toString() {
        return "DeepCloneTarget{" +
                "name='" + name + '\'' +
                ", className='" + className + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
