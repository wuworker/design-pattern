package com.wxl.designpattern.visitor;

import java.util.List;

/**
 * Create by wuxingle on 2020/4/27
 * 访问者模式
 */
public class VisitorMain {

    public static void main(String[] args) {
        DirElement root = new DirElement("root");

        DirElement usr = new DirElement("usr");
        usr.addElement(new FileElement("haha.cnf", 44));
        DirElement local = new DirElement("local");
        local.addElement(new FileElement("test.cnf", 100));
        local.addElement(new FileElement("hi.cnf", 77));
        usr.addElement(local);

        DirElement etc = new DirElement("etc");
        etc.addElement(new FileElement("my.cnf", 50));
        DirElement redis = new DirElement("redis");
        redis.addElement(new FileElement("redis.cnf", 33));
        etc.addElement(redis);

        DirElement home = new DirElement("home");
        home.addElement(new FileElement("helloworld.cnf", 1000));

        root.addElement(usr);
        root.addElement(etc);
        root.addElement(home);

        FileVisitor fileVisitor = new FileVisitor(".cnf");

        fileVisitor.visit(root);

        List<String> files = fileVisitor.findFiles();
        files.forEach(System.out::println);

    }
}
