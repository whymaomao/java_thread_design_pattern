package com.yue.Balking;

import java.io.IOException;

public class SaverThread extends Thread {
    private final Data data;

    public SaverThread(String name, Data data){
        super(name);
        this.data = data;
    }

    @Override
    public void run() {
        try{
            while(true){
                data.save();
                Thread.sleep(1000);
            }
        }catch (IOException e){
            System.out.println(e.getStackTrace());
        }catch(InterruptedException e){
            System.out.println(e.getStackTrace());
        }
    }
}
