package com.yue.Balking;

import java.io.FileWriter;
import java.io.IOException;

public class Data {
    private final String filename;
    private String content;
    private boolean changed;

    public Data(String filename, String content){
        this.filename = filename;
        this.content = content;
        this.changed = true;
    }

    public synchronized void change(String newContent){
        content = newContent;
        changed = true;
    }

    public synchronized void save() throws IOException{
        if(!changed) return;
        doSave();
        changed = false;
    }

    private void doSave() throws IOException{
        System.out.println(Thread.currentThread().getName() + " calls doSave, content = " + content);
        try(FileWriter fileWriter = new FileWriter(filename)){
            fileWriter.write(content);
        }
    }
}
