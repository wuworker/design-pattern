package com.wxl.designpattern.interpreter.expression;

import com.wxl.designpattern.interpreter.Context;
import com.wxl.designpattern.interpreter.Expression;

/**
 * Create by wuxingle on 2020/4/25
 * 加法
 */
public class AddExpression extends SymbolExpression {

    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(Context context) {
        return left.interpreter(context) + right.interpreter(context);
    }
}
