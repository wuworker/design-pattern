package com.wxl.designpattern.interpreter.expression;

import com.wxl.designpattern.interpreter.Context;
import com.wxl.designpattern.interpreter.Expression;

/**
 * Create by wuxingle on 2020/4/25
 * 变量表达式
 */
public class VarExpression extends Expression {

    private String var;

    public VarExpression(String var) {
        this.var = var;
    }

    @Override
    public int interpreter(Context context) {
        Integer res = context.get(var);
        if (res == null) {
            throw new IllegalStateException();
        }
        return res;
    }
}
