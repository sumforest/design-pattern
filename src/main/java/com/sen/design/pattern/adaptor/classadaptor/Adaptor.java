package com.sen.design.pattern.adaptor.classadaptor;

/**
 * @Auther: Sen
 * @Date: 2019/11/15 15:52
 * @Description: 类适配器模式
 */
public class Adaptor extends Voltage implements DST {
    @Override
    public int getAdaptorVoltage() {
        int output = output();
        int target = output / 44;
        System.out.println("220v电压已被转换成5v电压");
        return target;
    }
}
