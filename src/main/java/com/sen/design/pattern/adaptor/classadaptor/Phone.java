package com.sen.design.pattern.adaptor.classadaptor;

/**
 * @Auther: Sen
 * @Date: 2019/11/15 15:55
 * @Description:
 */
public class Phone {
    public void charging(Adaptor adaptor) {
        int adaptorVoltage = adaptor.getAdaptorVoltage();
        if (adaptorVoltage == 5) {
            System.out.println("手机充电成功");
        } else {
            System.out.println("电压转换异常，充电失败");
        }
    }
}
