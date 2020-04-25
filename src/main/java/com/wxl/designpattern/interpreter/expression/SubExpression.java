package com.wxl.designpattern.interpreter.expression;

import com.wxl.designpattern.interpreter.Context;
import com.wxl.designpattern.interpreter.Expression;

/**
 * Create by wuxingle on 2020/4/25
 * 减法
 */
public class SubExpression extends SymbolExpression {

    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(Context context) {
        return left.interpreter(context) - right.interpreter(context);
    }
}
