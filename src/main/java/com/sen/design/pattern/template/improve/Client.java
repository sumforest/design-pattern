package com.sen.design.pattern.template.improve;

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

        System.out.println("--------------制作纯豆浆---------------");
        SoyaMike prueSoyaMike = new PrueSoyaMike();
        prueSoyaMike.make();
    }
}
