package com.wxl.designpattern.memento;

import lombok.Data;

/**
 * Create by wuxingle on 2020/4/27
 * 下棋者
 */
@Data
public class Chessman {

    private String label;

    private int x;

    private int y;

    public Chessman(String label, int x, int y) {
        this.label = label;
        this.x = x;
        this.y = y;
    }

    public ChessmanMemento save() {
        return new ChessmanMemento(label, x, y);
    }

    public void restore(ChessmanMemento memento) {
        label = memento.getLabel();
        x = memento.getX();
        y = memento.getY();
    }

    public void show() {
        System.out.println("棋子:" + label + ", 当前位置:(" + x + "," + y + ")");
    }
}
