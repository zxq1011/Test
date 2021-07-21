package com.itheima03.TicketDemo01;

public class SellTicket implements Runnable{
private int tickets=100;
private Object obj =new Object();
    @Override
    public void run() {
        while(true){
            //tickets=100;
            //t1,t2,t3
            //假设t1抢到了cpu执行权
            //假设t2抢到了cpu执行权，但因为代码被锁，t2只能等待t1执行完毕
            synchronized (obj) {
                //t1进来后就会把这段代码锁起来
                if (tickets > 0) {
                    try {
                        Thread.sleep(100);
                        //t1休息100毫秒
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //窗口1正在出售第100张票
                    System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
                    tickets--;//tickets=99;
                }
            }
            //t1出来了，这段代码的锁就被释放了
        }
    }
}
