package com.itheima03.sczxfz;

public class Customer implements Runnable{
    private Box b;

    public Customer(Box b) {
        this.b =b;
    }

    @Override
    public void run() {
        while(true){
            b.get();
        }

    }
}
