package com.sen.design.pattern.state;

/**
 * @Auther: Sen
 * @Date: 2019/11/17 19:35
 * @Description:
 */
public class OutDispensePrize extends State {

    public OutDispensePrize(RaffleActivity activity) {
        super(activity);
    }

    @Override
    public void dedeuceMoney() {
        System.out.println("活动结束");
    }

    @Override
    public boolean raffle() {
        System.out.println("活动结束");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("非法操作");
    }
}
