package com.sen.design.pattern.template;

/**
 * @Auther: Sen
 * @Date: 2019/11/16 16:45
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        SoyaMike redBeanSoya = new RedBeanSoya();
        SoyaMike peanutBeanSoya = new PeanutBeanSoya();
        redBeanSoya.make();
        System.out.println("===========================");
        peanutBeanSoya.make();
    }
}
