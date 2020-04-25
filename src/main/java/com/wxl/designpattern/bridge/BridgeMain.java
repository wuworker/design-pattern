package com.wxl.designpattern.bridge;

/**
 * Create by wuxingle on 2020/4/25
 * 桥接模式
 * 将抽象化和实现化放在2个不同的类层次中，使它们可以独立改变
 * 抽象为Pen
 * 实现为Color
 * 通过抽象包含实现(Pen Has a Color)，实现了桥接
 */
public class BridgeMain {

    public static void main(String[] args) {
        Pen pen = new SmallPen();
        pen.setColor(new Red());

        pen.draw("nice");

        pen.setColor(new White());

        pen.draw("nice");

        pen = new BigPen();
        pen.setColor(new Blue());

        pen.draw("nice");
    }
}
