package com.sen.design.pattern.state;

import java.util.Random;

/**
 * @Auther: Sen
 * @Date: 2019/11/17 19:34
 * @Description:
 */
public class CanRaffle extends State {

    public CanRaffle(RaffleActivity activity) {
        super(activity);
    }

    @Override
    public void dedeuceMoney() {
        System.out.println("积分已经扣除，不能重复扣除请抽奖");
    }

    @Override
    public boolean raffle() {
        Random random = new Random();
        int ran = random.nextInt(10);
        if (ran == 0) {
            System.out.println("恭喜中奖");
            activity.setCurrentState(activity.getDispensePrize());
            return true;
        } else {
            System.out.println("很遗憾，您与大奖插肩而过");
            activity.setCurrentState(activity.getNoRaffle());
        }
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("非法调用");
    }
}
