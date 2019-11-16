package com.sen.design.pattern.observer;

/**
 * @Auther: Sen
 * @Date: 2019/11/17 00:43
 * @Description: 观察者模式
 */
public class Baidu implements Observer {
    @Override
    public void update(WeatherData weatherData) {
        System.out.println("百度天气：");
        System.out.println("当前气温：" + weatherData.getTemperature());
        System.out.println("当前气压:" + weatherData.getPrssure());
        System.out.println("当前湿度:" + weatherData.getHumidity());
    }
}
