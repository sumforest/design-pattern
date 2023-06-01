package com.sen.design.pattern.facade;

/**
 * @author: Sen
 * @date: 2020/3/4 18:20
 * @description:
 */
public class Projector {
    private static Projector instance = new Projector();


    public static Projector getInstance() { return instance;
    }


    public void on() {
        System.out.println(" Projector on ");
    }


    public void off() {
        System.out.println(" Projector ff ");
    }


    public void focus() {
        System.out.println(" Projector is Projector	");
    }


//...


    }
