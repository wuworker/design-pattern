package com.wxl.designpattern.memento;

/**
 * Create by wuxingle on 2020/4/27
 * 棋子客户端
 */
public class ChessGame {

    private int index = 0;

    private MementoCaretaker caretaker = new MementoCaretaker();

    /**
     * 下棋
     */
    public void play(Chessman chessman) {
        caretaker.addMemento(chessman.save());
        index++;
        chessman.show();
    }

    /**
     * 悔棋
     */
    public void undo(Chessman chessman) {
        if (index > 1) {
            index -= 2;
            System.out.println("----悔棋----");
            chessman.restore(caretaker.getMemento(index));
            chessman.show();
        } else {
            System.out.println("---不能悔棋---");

        }
    }
}
