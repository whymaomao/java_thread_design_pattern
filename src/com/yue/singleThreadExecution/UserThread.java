package com.yue.singleThreadExecution;

public class UserThread extends Thread{
    private final Gate gate;
    private final String myname;
    private final String myaddress;

    public UserThread(Gate gate, String myname, String myaddress){
        this.gate = gate;
        this.myaddress = myaddress;
        this.myname = myname;
    }

    public void run() {
        System.out.println(myname + " Begins");
        while(true){
            gate.pass(myname, myaddress);
        }
    }

}
