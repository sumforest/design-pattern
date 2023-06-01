package com.sen.design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: Sen
 * @Date: 2019/11/17 00:26
 * @Description: 具体被观察者
 */
public class WeatherData implements Subject {

    private double temperature;

    private double prssure;

    private double humidity;

    //观察者集合
    private List<Observer> observers;

    public WeatherData(double temperature, double prssure, double humidity) {
        this.observers = new ArrayList<>();
        this.temperature = temperature;
        this.prssure = prssure;
        this.humidity = humidity;
    }

    public void update(double temperature, double prssure, double humidity) {
        this.temperature = temperature;
        this.prssure = prssure;
        this.humidity = humidity;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }


    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getPrssure() {
        return prssure;
    }

    public void setPrssure(double prssure) {
        this.prssure = prssure;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }
}
