package com.yue.GuardedSuspension;

class Request {
    private final String name;

    public Request(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
//        return super.toString();
        return " [ Request " + name + " ]";
    }
}
