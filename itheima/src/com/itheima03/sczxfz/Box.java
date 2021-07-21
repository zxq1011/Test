package com.itheima03.sczxfz;

public class Box {
    private int milk;
    //定义一个成员变量，表示奶箱的状态
    private boolean state=false;

    //存储牛奶
    public synchronized void put(int milk){
        //如果有牛奶，等待消费
        if(state){
            try{
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //如果没有牛奶，就生产牛奶
        this.milk=milk;
        System.out.println("送奶工将第"+this.milk+"瓶奶放入奶箱");

        //生产完毕后，修改奶箱状态
        state=true;
        //唤醒其他等待线程
        notifyAll();
    }
    //获取牛奶
    public synchronized void get() {
        //如果没有牛奶 等待生产
        if(!state){
            try{
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //如果有牛奶就消费牛奶
        System.out.println("用户拿到第"+this.milk+"瓶奶");

        //消费完毕之后 修改奶箱状态
        state=false;
        notifyAll();
    }
}
