package com.itheima05;
/*
* 启动一个线程，在控制台输出一句话 多线程程序启动了
* */
public class LambdaDemo {
    public static void main(String[] args) {
/*        MyRunnable my =new MyRunnable();
        //实现类的方式实现需求
        Thread t =new Thread(my);
        t.start();
        */

        //匿名内部类的方式改进
       /* new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("多线程程序启动了");
            }
        }).start();*/

        //Lambada表达式的方式改进
        new Thread(() -> {
            System.out.println("多线程程序启动了");
        }).start();



    }
}
