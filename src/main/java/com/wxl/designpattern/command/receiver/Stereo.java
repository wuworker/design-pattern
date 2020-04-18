package com.wxl.designpattern.command.receiver;

import lombok.Data;

/**
 * Create by wuxingle on 2020/4/18
 * 音响
 */
@Data
public class Stereo {

    private String name;

    public Stereo(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println("stereo " + name + " on");
    }

    public void setCD() {
        System.out.println("stereo " + name + " set cd");
    }

    public void setVolume(int volume) {
        System.out.println("stereo " + name + " volume is:" + volume);

    }

    public void off() {
        System.out.println("stereo " + name + " off");
    }
}
