package com.sen.design.pattern.state;

/**
 * @Auther: Sen
 * @Date: 2019/11/17 19:29
 * @Description:
 */
public abstract class State {

    protected RaffleActivity activity;

    public State(RaffleActivity activity) {
        this.activity = activity;
    }

    /**
     * 扣减积分
     */
    public abstract void dedeuceMoney();

    /**
     * 是否中奖
     * @return
     */
    public abstract boolean raffle();

    /**
     * 颁发奖品
     */
    public abstract void dispensePrize();
}
