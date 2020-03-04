package com.sen.design.pattern.facade;

/**
 * @Auther: Sen
 * @Date: 2020/3/4 18:20
 * @Description:
 */
public class Screen {
    private static Screen instance = new Screen();


    public static Screen getInstance() { return instance;
    }







    public void up() { System.out.println(" Screen up ");
    }
    public void down() { System.out.println(" Screen down ");
    }



}
