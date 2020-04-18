package com.wxl.designpattern.command.impl;

import com.wxl.designpattern.command.Command;
import com.wxl.designpattern.command.receiver.Light;
import com.wxl.designpattern.command.receiver.Stereo;

/**
 * Create by wuxingle on 2020/4/18
 * 开音响
 */
public class StereoOnCommand implements Command {

    private Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(1);
    }
}
