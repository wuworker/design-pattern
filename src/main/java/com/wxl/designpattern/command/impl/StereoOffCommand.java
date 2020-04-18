package com.wxl.designpattern.command.impl;

import com.wxl.designpattern.command.Command;
import com.wxl.designpattern.command.receiver.Stereo;

/**
 * Create by wuxingle on 2020/4/18
 * 关音响
 */
public class StereoOffCommand implements Command {

    private Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
}
