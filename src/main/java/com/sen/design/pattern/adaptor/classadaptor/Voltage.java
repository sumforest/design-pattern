package com.sen.design.pattern.adaptor.classadaptor;

/**
 * @Auther: Sen
 * @Date: 2019/11/15 15:50
 * @Description: 被适配器类
 */
public class Voltage {
    public int output() {
        int voltage = 220;
        System.out.println("当前输出电压：" + voltage + "伏");
        return voltage;
    }
}
