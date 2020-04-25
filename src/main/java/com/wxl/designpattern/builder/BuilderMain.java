package com.wxl.designpattern.builder;

/**
 * Create by wuxingle on 2020/4/25
 * 生成器模式
 */
public class BuilderMain {

    public static void main(String[] args) {
        SimpleCarBuilder builder = new SimpleCarBuilder();
        Car car = builder.setWheel("cheep wheel")
                .setEngine("cheep engine")
                .setFrame("cheep frame")
                .setWidget("no widget")
                .build();

        System.out.println(car);
    }
}
