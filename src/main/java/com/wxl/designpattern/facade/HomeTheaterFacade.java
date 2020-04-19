package com.wxl.designpattern.facade;

/**
 * Create by wuxingle on 2020/4/19
 * 家庭影院
 */
public class HomeTheaterFacade {

    private DVDPlayer dvdPlayer;

    private Light light;

    private Screen screen;

    public HomeTheaterFacade(DVDPlayer dvdPlayer, Light light, Screen screen) {
        this.dvdPlayer = dvdPlayer;
        this.light = light;
        this.screen = screen;
    }

    public void watchMovie(String movie){
        screen.open();
        light.off();
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie(){
        System.out.println("shutdown movie");
        light.on();
        dvdPlayer.down();
        screen.shutdown();
    }
}
