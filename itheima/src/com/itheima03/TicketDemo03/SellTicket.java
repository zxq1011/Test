package com.itheima03.TicketDemo03;

public class SellTicket implements Runnable{
//private int tickets=100;s
private static int tickets=100;
private Object obj =new Object();
private int x=0;
    @Override
    public void run() {
        while(true) {
            if (x % 2 == 0) {
                synchronized (SellTicket.class) {
                    if (tickets > 0) {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
                        tickets--;//tickets=99;
                    }
                }
            }else{
//                synchronized (obj) {
//                    if (tickets > 0) {
//                        try {
//                            Thread.sleep(100);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                        System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
//                        tickets--;//tickets=99;
//                    }
//                }
                sellTicket();
            }
        x++;
        }
    }

//    private synchronized void sellTicket() {
//
//            if (tickets > 0) {
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
//                tickets--;//tickets=99;
//            }
//        }
private static synchronized  void sellTicket() {

    if (tickets > 0) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
        tickets--;//tickets=99;
    }
}

}
