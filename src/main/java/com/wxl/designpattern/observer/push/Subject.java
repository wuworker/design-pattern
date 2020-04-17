package com.wxl.designpattern.observer.push;

/**
 * Create by wuxingle on 2020/4/16
 * 主题
 */
public interface Subject {

    void register(Observer observer);

    void unregister(Observer observer);

    void notifyObservers();
}
