package com.sen.design.pattern.facade;

/**
 * @Auther: Sen
 * @Date: 2020/3/4 18:16
 * @Description: 外观模式
 */
public class Client {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //这里直接调用。。 很麻烦
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
        homeTheaterFacade.play();


        homeTheaterFacade.end();
    }
}
