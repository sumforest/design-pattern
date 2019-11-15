package com.sen.design.pattern.Bridge;

/**
 * @Auther: Sen
 * @Date: 2019/11/15 18:16
 * @Description: 行为接口实现类
 */
public class Huawei implements Brand {
    @Override
    public void open() {
        System.out.println("华为手机开机");
    }

    @Override
    public void call() {
        System.out.println("华为手机打电话");
    }

    @Override
    public void close() {
        System.out.println("华为手机关机");
    }
}
