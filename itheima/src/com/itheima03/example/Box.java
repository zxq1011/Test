package com.itheima03.example;
// 1、奶箱类（Box）：定义一个成员变量，表示第x瓶奶，提供存储牛奶和获取牛奶的操作
public class Box {
    private int  milk;
    private boolean state=false;
    //放置牛奶
    public synchronized void put(int milk){
        if(state){
            try{
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //没有牛奶
        this.milk=milk;
        System.out.println("这是生产的第"+this.milk+"瓶奶");

        state=true;
        notifyAll();



    }
    //获取牛奶
    public synchronized void  get(){
        if (!state){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("消费者获得第"+this.milk+"瓶奶");

        state=false;
        notifyAll();

    }

}
