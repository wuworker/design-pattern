package com.wxl.designpattern.memento;

/**
 * Create by wuxingle on 2020/4/27
 * 备忘录模式
 */
public class MementoMain {

    public static void main(String[] args) {
        ChessGame game = new ChessGame();
        Chessman chessman = new Chessman("车", 1, 1);

        game.play(chessman);
        chessman.setY(5);
        game.play(chessman);
        chessman.setX(4);
        game.play(chessman);

        game.undo(chessman);
    }
}
