package com.yue.GuardedSuspension;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class RequestQueue {
    private final Queue<Request> queue = new LinkedList<Request>();
    // LinkedBlockingQueue使用了GuardedSuspension模式
    private final BlockingQueue<Request> blockingQueue = new LinkedBlockingQueue<>();

    public Request getBlockingRequest() {
        Request request = null;
        try{
            request = blockingQueue.take();
        }catch (InterruptedException e){

        }
        return request;
    }

    public void pubBlockingRequest(Request request) {
        try{
            blockingQueue.put(request);
        }catch (InterruptedException e){

        }
    }
    /////////////使用put take方法，已经考虑了互斥

    public synchronized Request getRequest() {
        while(queue.peek() == null){
            try{
                wait();
            }catch (InterruptedException e){

            }
        }
        return queue.remove();
    }

    public synchronized void putRequest(Request request) {
        queue.offer(request);
        notifyAll();

    }
}
