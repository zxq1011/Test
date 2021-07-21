package com.itheima03.TicketDemo02;

import com.itheima03.TicketDemo01.SellTicket;
public class SellTicketDemo {
    public static void main(String[] args) {
        com.itheima03.TicketDemo01.SellTicket st =new SellTicket();

        Thread t1 =new Thread(st,"窗口1");
        Thread t2 =new Thread(st,"窗口2");
        Thread t3= new Thread(st,"窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
