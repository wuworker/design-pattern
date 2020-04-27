package com.wxl.designpattern.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by wuxingle on 2020/4/27
 * 负责人
 */
public class MementoCaretaker {

    private List<ChessmanMemento> mementos = new ArrayList<>();

    public void addMemento(ChessmanMemento memento) {
        mementos.add(memento);
    }

    public ChessmanMemento getMemento(int i) {
        return mementos.get(i);
    }
}
