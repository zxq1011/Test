package com.itheima03.TicketDemo01;
/*为什么会出现安全问题
*   1、是否是多线程环境
*   2、是否有共享数据
*   3、是否为多个语句操作共享数据
*
*   解决多线程安全问题：
*   基本思想：让这个程序没有安全问题的环境
*
*   如何实现
*   把多条语句操作共享数据的代码锁起来 让任意时刻只能有一个线程执行即可
*   Java提供了同步代码块的方式解决
*
*   synchronized(任意对象){
*       多条语句操作共享数据代码
*   }
*
*
*
*   同步的好处和弊端：
*   好处：解决了多线程的数据安全问题
*   弊端：当线程很多时，因为每个线程都会去判断同步上的锁，这是很耗费资源的，无形中会降低程序的运行效率
* */
public class SellTicketDemo {
    public static void main(String[] args) {
        SellTicket st =new SellTicket();

        Thread t1 =new Thread(st,"窗口1");
        Thread t2 =new Thread(st,"窗口2");
        Thread t3= new Thread(st,"窗口3");


        t1.start();
        t2.start();
        t3.start();
    }
}
