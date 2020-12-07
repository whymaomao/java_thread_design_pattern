package com.yue.ProducerConsumer;

import java.util.Random;

public class EaterThread extends Thread {
    private final Random random;
    private final Table table;
    public EaterThread(String name, Table table, long seed) {
        super(name);
        random = new Random(seed);
        this.table = table;
    }

    public void run() {
        try{
            while(true){
                String cake = table.take();
                Thread.sleep(random.nextInt(10000));
            }
        }catch(InterruptedException e){

        }
    }

    public static void main(String[] args){
        Table table = new Table(3);
        new MakerThread("MakerThread-1", table, 12345).start();
        new MakerThread("MakerThread-2", table, 23456).start();
        new MakerThread("MakerThread-3", table ,12347).start();
        new EaterThread("EaterThread-1", table, 12346).start();
        new EaterThread("EaterThread-2", table, 23456).start();
        new EaterThread("EaterThread-3", table, 45678).start();
    }
}
