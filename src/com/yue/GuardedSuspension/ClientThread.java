package com.yue.GuardedSuspension;

import java.util.Random;

class ClientThread extends Thread {
    private final Random random;

    private final RequestQueue requestQueue;

    public ClientThread(RequestQueue requestQueue, String name, long seed){
        super(name);
        this.requestQueue = requestQueue;
        this.random = new Random(seed);
    }

    @Override
    public void run() {
        for(int i = 0; i < 100; i ++){
            Request request = new Request("No." + i);
            System.out.println(Thread.currentThread().getName() + " requests " + request);
            requestQueue.putRequest(request);
            try{
                Thread.sleep(random.nextInt(100));
            }catch (InterruptedException e){

            }
        }
    }
}
