package com.wxl.designpattern.observer.pull;

/**
 * Create by wuxingle on 2020/4/17
 * 观察者模式
 * push方式
 */
public class ObserverMain {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticDisplay statisticDisplay = new StatisticDisplay(weatherData);

        weatherData.setMeasurements(20, 30, 40);
        weatherData.setMeasurements(35, 20, 65);
        weatherData.setMeasurements(15, 60, 30);
    }
}
