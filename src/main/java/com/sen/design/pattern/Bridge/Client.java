package com.sen.design.pattern.Bridge;

/**
 * @Auther: Sen
 * @Date: 2019/11/15 18:22
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        FlodedPhone flodedPhone = new FlodedPhone(new Xiaomi());
        flodedPhone.open();
        flodedPhone.call();
        flodedPhone.close();
        System.out.println("----------------------");
        FlodedPhone huaweiPhone = new FlodedPhone(new Huawei());
        huaweiPhone.open();
        huaweiPhone.call();
        huaweiPhone.close();
        System.out.println("----------------------");
        UplightPhone xiaomiUplightPhone = new UplightPhone(new Xiaomi());
        xiaomiUplightPhone.open();
        xiaomiUplightPhone.call();
        xiaomiUplightPhone.close();
        System.out.println("----------------------");
        UplightPhone huaweiUplightPhone = new UplightPhone(new Huawei());
        huaweiUplightPhone.open();
        huaweiUplightPhone.call();
        huaweiUplightPhone.close();
    }
}
