package com.yue.GuardedSuspension;

import java.util.Random;

class ServerThread extends Thread {
    private final Random random;

    private final RequestQueue requestQueue;

    public ServerThread(RequestQueue requestQueue, String name, long seed){
        super(name);
        this.requestQueue = requestQueue;
        this.random = new Random(seed);
    }

    @Override
    public void run() {
        for(int i = 0; i < 100; i ++){
            Request request =  requestQueue.getRequest();
            System.out.println(Thread.currentThread().getName() + " Handles " + request);
            try{
                Thread.sleep(random.nextInt(100));
            }catch (InterruptedException e){

            }
        }
    }

    public static void main(String[] args){
        RequestQueue requestQueue = new RequestQueue();
        new ClientThread(requestQueue, "Alice", 123456L).start();
        new ServerThread(requestQueue, "Bob", 1234567L).start();
    }
}
