package com.sen.design.pattern.builder;

/**
 * @Auther: Sen
 * @Date: 2019/11/15 14:48
 * @Description: 具体建造者
 */
public class CommonHouseBuilder extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("打5米地基，建普通房子");
    }

    @Override
    public void buildWall() {
        System.out.println("砌10厘米的墙，建普通房子");
    }

    @Override
    public void roofed() {
        System.out.println("盖普通房子的屋顶");
    }
}
