package com.wxl.designpattern.facade;

/**
 * Create by wuxingle on 2020/4/19
 * 门面模式
 */
public class FacadeMain {

    public static void main(String[] args) {
        DVDPlayer dvdPlayer = new DVDPlayer();
        Light light = new Light();
        Screen screen = new Screen();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(dvdPlayer, light, screen);

        homeTheaterFacade.watchMovie("haha");

        System.out.println("----------------------------------");

        homeTheaterFacade.endMovie();
    }
}
