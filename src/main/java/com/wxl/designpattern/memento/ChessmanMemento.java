package com.wxl.designpattern.memento;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Create by wuxingle on 2020/4/27
 * 备忘录角色
 */
@Data
@AllArgsConstructor
public class ChessmanMemento {

    private String label;

    private int x;

    private int y;
}
