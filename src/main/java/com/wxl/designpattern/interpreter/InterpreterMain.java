package com.wxl.designpattern.interpreter;

/**
 * Create by wuxingle on 2020/4/25
 * 解释器模式
 */
public class InterpreterMain {

    public static void main(String[] args) {
        Calculator calculator = new Calculator("a+b-c");
        Context context = new Context();
        context.put("a", 10);
        context.put("b", 5);
        context.put("c", 8);

        int result = calculator.run(context);

        System.out.println("result is:" + result);
    }
}
