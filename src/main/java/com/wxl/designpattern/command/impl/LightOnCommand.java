package com.wxl.designpattern.command.impl;

import com.wxl.designpattern.command.Command;
import com.wxl.designpattern.command.receiver.Light;

/**
 * Create by wuxingle on 2020/4/18
 * 开灯
 */
public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
