# 设计模式

## 策略模式
策略模式（Strategy），定义了一组算法，将每个算法都封装起来，并且使它们之间可以互换


## 观察者模式
定义了对象之间的一对多依赖，这样当一个对象状态改变时，它的所有依赖者都能得到通知并自动更新

## 装饰者模式
动态得将责任附加到对象上。若要扩展功能，装饰者提供了比继承更有弹性的替代方案

## 工厂方法模式
定义了一个创建对象的接口，由子类决定实例化哪一个类。工厂方法让类把实例化推迟到子类

## 抽象工厂模式
提供一个接口，用于创建相关或依赖对象的家族，而不需要明确指定具体类

## 单例模式
确保一个类只有一个实例，并提供一个全局访问点

## 命令模式
将请求封装成对象，以便使用不同的请求、队列或日志来参数化其他对象。也支持可撤销的操作

## 适配器模式
将一个接口的类，转换成客户希望的另一个接口。适配器让原本接口不兼容的类可以合作无间

## 门面模式(外观模式)
提供了一个统一的接口，用来访问子系统中的一群接口。外观定义了一个高层接口，让子系统更容易使用

## 模版方法模式
在一个方法中，定义一个算法的骨架，而将一些步骤延迟到子类中。使得子类在不改变算法骨架的情况下，重新定义算法的某些步骤

## 迭代器模式
提供一种方法，顺序访问聚合对象的各个元素，而又不暴露其内部的表示

## 组合模式
允许将对象组合成树形结构来表现"整体/部分"层次结构。组合能让客户以一致的方式处理个别对象以及对象组合



# 设计原则

1. 找出应用中需要变化的部分，把它们独立出来，不要和那些不需要变化的代码混在一起
2. 针对接口编程，而不是针对实现编程
3. 多用组合，少用继承
4. 为了交互对象之间的松耦设计而努力
5. 类应该对扩展开放，对修改关闭
6. 要依赖抽象，不要依赖具体类（依赖倒置）
7. 最少知识原则
8. 好莱坞原则（别调用我们，我们会调用你,比如模版方法模式）
9. 一个类应该只有一个引起变化的原因（单一职责）


# 设计模式比较

## 工厂方法和抽象工厂
工厂方法通过继承实现，抽象工厂使用组合
工厂方法只创建一个产品，抽象工厂一般创建一批同类产品，如有新产品需要修改接口














