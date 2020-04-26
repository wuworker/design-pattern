package com.wxl.designpattern.mediator;

import lombok.Data;

/**
 * Create by wuxingle on 2020/4/26
 * 中介
 */
@Data
public class Mediator {

    private Colleague1 colleague1;

    private Colleague2 colleague2;


    public void sendMessageToColleague1(String message) {
        colleague1.receiveMessage(message);
    }


    public void sendMessageToColleague2(String message) {
        colleague2.receiveMessage(message);
    }
}
