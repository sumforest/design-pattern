package com.sen.design.pattern.builder;

/**
 * @Auther: Sen
 * @Date: 2019/11/15 14:50
 * @Description: 具体建造者
 */
public class HighHouseBuilder extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("建高楼打50米的地基");
    }

    @Override
    public void buildWall() {
        System.out.println("砌20厘米的墙");
    }

    @Override
    public void roofed() {
        System.out.println("玻璃封顶");
    }
}
