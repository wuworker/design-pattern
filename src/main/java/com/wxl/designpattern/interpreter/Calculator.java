package com.wxl.designpattern.interpreter;

import com.wxl.designpattern.interpreter.expression.AddExpression;
import com.wxl.designpattern.interpreter.expression.SubExpression;
import com.wxl.designpattern.interpreter.expression.VarExpression;

import java.util.Stack;

/**
 * Create by wuxingle on 2020/4/25
 * 表达式计算
 */
public class Calculator {


    private Expression expression;

    public Calculator(String expStr) {
        Stack<Expression> stack = new Stack<>();

        char[] chars = expStr.toCharArray();

        Expression left;
        Expression right;
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case '+':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(chars[++i]));
                    stack.push(new AddExpression(left, right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(chars[++i]));
                    stack.push(new SubExpression(left, right));
                    break;
                default:
                    stack.push(new VarExpression(String.valueOf(chars[i])));
                    break;
            }
        }
        this.expression = stack.pop();
    }

    public int run(Context context) {
        return expression.interpreter(context);
    }
}
