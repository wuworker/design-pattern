package com.wxl.designpattern.strategy;

import com.wxl.designpattern.strategy.impl.MuteQuack;

/**
 * Create by wuxingle on 2020/4/16
 * 策略模式
 * <pre>
 *     // 通过duck继承的方式实现飞行，呱呱叫，会导致所有子类都产生了行为，需要通过覆盖方法修改默认实现
 *     public class Duck {
 *          public void fly(){
 *              //...
 *          }
 *          public void quack(){
 *              //...
 *          }
 *     }
 *
 *     public class Duck1 extend Duck {
 *     }
 * </pre>
 * <p>
 * <pre>
 *     // 通过duck实现Fly,Quack接口的方式，会导致大量重复代码，需要修改，就要改很多类
 *     public interface Fly{
 *         void fly();
 *     }
 *
 *     public class Duck1 extend Duck implement Fly {
 *
 *     }
 * </pre>
 * <p>
 * <p>
 * 把飞行，呱呱叫行为分别当成一族算法，通过吧鸭子的行为委托给FlyBehavior,QuackBehavior进行实现
 * 通过这种组合的方式，还可以动态改变行为
 */
public class StrategyMain {

    public static void main(String[] args) {
        Duck duck = new ModelDuck();
        duck.performFly();
        duck.performQuack();

        duck.setQuackBehavior(new MuteQuack());
        duck.performQuack();
    }
}












