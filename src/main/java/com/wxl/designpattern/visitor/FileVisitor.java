package com.wxl.designpattern.visitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Create by wuxingle on 2020/4/27
 * 访问文件后缀
 */
public class FileVisitor implements Visitor {

    private String suffix;

    private String currentDir = "";

    private List<String> files = new ArrayList<>();

    public FileVisitor(String suffix) {
        this.suffix = suffix;
    }

    @Override
    public void visit(FileElement file) {
        if (file.getName().endsWith(suffix)) {
            files.add(currentDir + "/" + file.getName());
        }
    }

    @Override
    public void visit(DirElement dir) {
        String saveDir = currentDir;
        currentDir += "/" + dir.getName();

        for (Element element : dir) {
            element.accept(this);
        }
        currentDir = saveDir;
    }

    public List<String> findFiles() {
        return Collections.unmodifiableList(files);
    }
}
