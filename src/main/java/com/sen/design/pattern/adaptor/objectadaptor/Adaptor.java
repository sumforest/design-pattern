package com.sen.design.pattern.adaptor.objectadaptor;

/**
 * @Auther: Sen
 * @Date: 2019/11/15 15:52
 * @Description: 对象适配器模式
 */
public class Adaptor implements DST {

    private Voltage voltage;

    public Adaptor(Voltage voltage) {
        this.voltage = voltage;
    }

    @Override
    public int getAdaptorVoltage() {
        int target = 0;
        if (voltage != null) {
            int output = voltage.output();
            target = output / 44;
            System.out.println("220v电压已被转换成5v电压");
        }
        return target;
    }
}
