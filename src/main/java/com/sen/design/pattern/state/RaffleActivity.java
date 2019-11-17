package com.sen.design.pattern.state;

/**
 * @Auther: Sen
 * @Date: 2019/11/17 19:33
 * @Description:
 */
public class RaffleActivity {

    /**
     * 奖品数量
     */
    private int count;

    /**
     * 当前状态
     */
    private State currentState;

    private State noRaffle = new NoRaffle(this);
    private State canRaffle = new CanRaffle(this);
    private State dispensePrize = new DispensePrize(this);
    private State outDispensePrize = new OutDispensePrize(this);

    //初始化未不可抽奖状态
    public RaffleActivity(int count) {
        this.count = count;
        this.currentState = this.noRaffle;
    }

    /**
     * 抽奖
     */
    public void deduceMoney() {
        currentState.dedeuceMoney();
    }

    public void raffle() {
        if (currentState.raffle()) {
            currentState.dispensePrize();
        }
    }

    public int getCount() {
        int ret = count;
        count--;
        return ret;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public State getNoRaffle() {
        return noRaffle;
    }

    public void setNoRaffle(State noRaffle) {
        this.noRaffle = noRaffle;
    }

    public State getCanRaffle() {
        return canRaffle;
    }

    public void setCanRaffle(State canRaffle) {
        this.canRaffle = canRaffle;
    }

    public State getDispensePrize() {
        return dispensePrize;
    }

    public void setDispensePrize(State dispensePrize) {
        this.dispensePrize = dispensePrize;
    }

    public State getOutDispensePrize() {
        return outDispensePrize;
    }

    public void setOutDispensePrize(State outDispensePrize) {
        this.outDispensePrize = outDispensePrize;
    }
}
