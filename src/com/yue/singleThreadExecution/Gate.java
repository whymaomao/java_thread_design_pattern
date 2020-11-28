package com.yue.singleThreadExecution;

public class Gate {
    // not thread safe
    // add synchronized in function pass() and toString()
    private int count = 0;
    private String name = "Nobody";
    private String address = "Nowhere";

    private  void check() {
        if(name.charAt(0) != address.charAt(0)){
            System.out.println("******Broken*******" + toString());
        }
    }

    public synchronized String toString() {
        return "No" + count + ":" + name  + "," + address;
    }

    public synchronized void pass(String name, String address) {
        this.count ++;
        this.name = name;
        this.address = address;
        check();
    }

    public static void main(String[] args){
        Gate gate = new Gate();
        new UserThread(gate, "Alice", "Alaska").start();
        new UserThread(gate, "Bobby", "Brazile").start();
        new UserThread(gate, "Chris", "Canada").start();

    }
}
