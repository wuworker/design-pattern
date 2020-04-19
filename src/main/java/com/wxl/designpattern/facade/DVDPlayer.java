package com.wxl.designpattern.facade;

/**
 * Create by wuxingle on 2020/4/19
 * DVD播放器
 */
public class DVDPlayer {

    public void on() {
        System.out.println("open DVD");

    }

    public void play(String movie) {
        System.out.println("play " + movie + " DVD");
    }

    public void down() {
        System.out.println("down DVD");
    }
}
