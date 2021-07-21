package com.itheima03;
/*
*   方式二：
*          1、定义一个类MyRunnable实现Runnable接口
*          2、在MyRunnable类中重写run（）方法
*          3、创建MyRunnable类的对象
*          4、创建Thread类的对象，把MyRunnable对象作为构造方法的参数
*          5、启动线程
* */
public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }

}
