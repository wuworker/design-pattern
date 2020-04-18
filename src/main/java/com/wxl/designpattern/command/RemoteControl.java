package com.wxl.designpattern.command;

import com.wxl.designpattern.command.impl.NoCommand;

/**
 * Create by wuxingle on 2020/4/18
 * 调用者，遥控器
 */
public class RemoteControl {

    private Command[] onCmd;

    private Command[] offCmd;

    public RemoteControl() {
        int size = slotSize();
        onCmd = new Command[size];
        offCmd = new Command[size];

        for (int i = 0; i < size; i++) {
            onCmd[i] = new NoCommand();
            offCmd[i] = new NoCommand();
        }
    }

    public void setCommand(int slot, Command on, Command off) {
        onCmd[slot] = on;
        offCmd[slot] = off;
    }

    public void onButtonPushed(int slot) {
        onCmd[slot].execute();
    }

    public void offButtonPushed(int slot) {
        offCmd[slot].execute();
    }

    public static int slotSize() {
        return 4;
    }
}
