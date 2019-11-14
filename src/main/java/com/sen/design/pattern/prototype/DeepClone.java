package com.sen.design.pattern.prototype;


import java.io.*;

/**
 * @Auther: Sen
 * @Date: 2019/11/15 02:54
 * @Description: 实现深拷贝
 */
public class DeepClone implements Serializable, Cloneable {
    private String name;
    private DeepCloneTarget target;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeepCloneTarget getTarget() {
        return target;
    }

    public void setTarget(DeepCloneTarget target) {
        this.target = target;
    }

    @Override
    public String toString() {
        return "DeepClone{" +
                "name='" + name + '\'' +
                ", target=" + target +
                '}';
    }

    /**
     * 深拷贝实现方法一：应用类型的成员变量单独调用自身的拷贝方法
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        DeepClone deepClone = (DeepClone) super.clone();
        deepClone.target = (DeepCloneTarget) this.target.clone();
        return deepClone;
    }

    public DeepClone cloneBySerializable() {
        ByteArrayOutputStream bos = null;
        ByteArrayInputStream bis =null;
        ObjectInputStream ois = null;
        ObjectOutputStream oos = null;
        DeepClone deepClone = null;
        try {
            //利用序列化的特性，把对象的引用类型也写到字节数组中
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            //反序列化在把写出去的字节数组读回来实现拷贝
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            deepClone = (DeepClone) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return deepClone;
    }
}
