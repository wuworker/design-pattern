package com.wxl.designpattern.command;

import com.wxl.designpattern.command.impl.LightOffCommand;
import com.wxl.designpattern.command.impl.LightOnCommand;
import com.wxl.designpattern.command.impl.StereoOffCommand;
import com.wxl.designpattern.command.impl.StereoOnCommand;
import com.wxl.designpattern.command.receiver.Light;
import com.wxl.designpattern.command.receiver.Stereo;

/**
 * Create by wuxingle on 2020/4/18
 * 命令模式
 * <pre>
 *     通过宏命令，同时包含多个命令，达到一次调用，执行多个命令
 *     class Commands implement Command {
 *         private Command[] commands;
 *
 *         public void execute(){
 *             for(Command cmd : commands){
 *                 cmd.execute();
 *             }
 *         }
 *
 *     }
 * </pre>
 * 用途
 * - 队列请求: 一端添加命令，一端取命令执行，工作队列和进行计算的对象完全解耦
 * - 日志请求: 命令增加store和load方法，对执行的请求记录日志，可以在死机之后进行恢复
 */
public class CommandMain {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light kitchen = new Light("kitchen");
        Light living = new Light("living room");

        Stereo stereo = new Stereo("living room");

        LightOnCommand kitchenOn = new LightOnCommand(kitchen);
        LightOffCommand kitchenOff = new LightOffCommand(kitchen);

        LightOnCommand livingOn = new LightOnCommand(living);
        LightOffCommand livingOff = new LightOffCommand(living);

        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, kitchenOn, kitchenOff);
        remoteControl.setCommand(1, livingOn, livingOff);
        remoteControl.setCommand(2, stereoOnCommand, stereoOffCommand);

        remoteControl.onButtonPushed(0);
        remoteControl.onButtonPushed(2);
        remoteControl.offButtonPushed(0);
        remoteControl.onButtonPushed(1);
        remoteControl.offButtonPushed(2);
    }

}

