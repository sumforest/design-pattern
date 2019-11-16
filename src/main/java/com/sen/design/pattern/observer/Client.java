package com.sen.design.pattern.observer;

/**
 * @Auther: Sen
 * @Date: 2019/11/17 00:41
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData(17, 130, 60);
        Weibo weibo = new Weibo();
        weatherData.registerObserver(weibo);
        weatherData.notifyObservers();
        System.out.println("-------注册百度-------");
        Baidu baidu = new Baidu();
        weatherData.registerObserver(baidu);
        System.out.println("------刷新数据--------");
        weatherData.update(18, 120, 55);


    }
}
