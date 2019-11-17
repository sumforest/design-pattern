package com.sen.design.pattern.state;

/**
 * @Auther: Sen
 * @Date: 2019/11/17 19:54
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        RaffleActivity raffleActivity = new RaffleActivity(3);

        for (int i = 0; i < 30; i++) {
            raffleActivity.deduceMoney();
            raffleActivity.raffle();
        }
    }
}
