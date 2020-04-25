package com.wxl.designpattern.builder;

/**
 * Create by wuxingle on 2020/4/25
 * car Builder
 */
public interface CarBuilder {

    CarBuilder setWheel(String wheel);

    CarBuilder setFrame(String frame);

    CarBuilder setEngine(String engine);

    CarBuilder setWidget(String widget);

    Car build();
}
