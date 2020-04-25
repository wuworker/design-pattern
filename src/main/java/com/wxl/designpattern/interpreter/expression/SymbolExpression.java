package com.wxl.designpattern.interpreter.expression;

import com.wxl.designpattern.interpreter.Expression;

/**
 * Create by wuxingle on 2020/4/25
 * 运算符号解释器
 */
public abstract class SymbolExpression extends Expression {

    protected Expression left;

    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

}
