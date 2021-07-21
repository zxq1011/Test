package com.itheima03;
// void join() 等待这个线程死亡
public class ThreadJoinDemo {
    public static void main(String[] args) throws InterruptedException {
        ThreadJoin tj1=new ThreadJoin();
        ThreadJoin tj2=new ThreadJoin();
        ThreadJoin tj3=new ThreadJoin();

        tj1.setName("康熙");
        tj2.setName("四阿哥");
        tj3.setName("八阿哥");

        tj1.start();
        tj1.join();
        tj2.start();
        tj3.start();

    }
}
