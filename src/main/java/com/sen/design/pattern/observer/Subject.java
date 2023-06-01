package com.sen.design.pattern.observer;

/**
 * @Auther: Sen
 * @Date: 2019/11/17 00:28
 * @Description: 被观察者接口
 */
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
