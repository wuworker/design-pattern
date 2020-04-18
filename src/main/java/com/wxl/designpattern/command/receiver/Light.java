package com.wxl.designpattern.command.receiver;

import lombok.Data;

/**
 * Create by wuxingle on 2020/4/18
 * 电灯
 */
@Data
public class Light {

    private String name;

    public Light(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println("light " + name + " on");
    }

    public void off() {
        System.out.println("light " + name + " off");
    }
}
