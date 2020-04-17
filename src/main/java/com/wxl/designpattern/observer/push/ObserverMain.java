package com.wxl.designpattern.observer.push;

import com.wxl.designpattern.observer.push.impl.CurrentConditionsDisplay;
import com.wxl.designpattern.observer.push.impl.StatisticDisplay;
import com.wxl.designpattern.observer.push.impl.WeatherData;

/**
 * Create by wuxingle on 2020/4/16
 * 观察者模式
 * push方式
 */
public class ObserverMain {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticDisplay statisticDisplay = new StatisticDisplay(weatherData);


        weatherData.setMeasurements(20,30,40);
        weatherData.setMeasurements(30,20,60);
        weatherData.setMeasurements(10,40,30);
    }
}
