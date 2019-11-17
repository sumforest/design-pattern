package com.sen.design.pattern.state;

/**
 * @Auther: Sen
 * @Date: 2019/11/17 19:33
 * @Description:
 */
public class NoRaffle extends State {
    public NoRaffle(RaffleActivity activity) {
        super(activity);
    }

    @Override
    public void dedeuceMoney() {
        System.out.println("扣减50积分");
        activity.setCurrentState(activity.getCanRaffle());
    }

    @Override
    public boolean raffle() {
        System.out.println("当前状态不能抽奖");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("当前状态不能抽奖");
    }
}
