package com.sen.design.pattern.state;

/**
 * @Auther: Sen
 * @Date: 2019/11/17 19:35
 * @Description:
 */
public class DispensePrize extends State {

    public DispensePrize(RaffleActivity activity) {
        super(activity);
    }

    @Override
    public void dedeuceMoney() {
        System.out.println("非法操作");
    }

    @Override
    public boolean raffle() {
        System.out.println("非法操作");
        return false;
    }

    @Override
    public void dispensePrize() {
        int count = activity.getCount();
        if (count > 0) {
            System.out.println("颁发奖品一件");
            activity.setCurrentState(activity.getNoRaffle());
        } else {
            System.out.println("活动结束");
            activity.setCurrentState(activity.getOutDispensePrize());
        }
    }
}
