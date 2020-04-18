package com.wxl.designpattern.command.impl;

import com.wxl.designpattern.command.Command;
import com.wxl.designpattern.command.receiver.Light;

/**
 * Create by wuxingle on 2020/4/18
 * 关灯
 */
public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
