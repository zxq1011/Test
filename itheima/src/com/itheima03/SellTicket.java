package com.itheima03;
/*
*   需求：某电影院目前正在上映某国产大片，共有100张票，而它有三个窗口卖票，请设计一个程序模拟该电影院卖票
*
*   思路：1、定义一个类SellTicket实现Runnable接口，里面定义ige成员变量，private int tickets =100；
*        2、在Sell Ticket类中重写run（）方法实现卖票，代码步骤如下：
*           A：判断票数大于0，就卖票，并告知是哪个窗口卖的；
*           B：卖了票之后，总票数减一；
*           C；票没有了，也可能有人来问，所以这用死循环让卖票的动作一直执行
*       3、定义一个测试类SellTicketDemo，里面有main()方法，代码步骤如下：
*           A：创建Sell Ticket类对象
*           B：创建三个Thread类的对象，把SellTicket对象作为构造方法的参数，并给出对应的窗口名称
*           C：启动线程
* */
public class SellTicket implements Runnable{
    private int tickets =100;
    @Override
    public void run() {
        //相同票出现多次
//        while(true){
//            //tickets=100
//            //t1,t2,t3
//            //假设t1线程抢到了cpu执行权
//        if (tickets>0){
//            //通过sleep方法模拟出票时间
//            try {
//                Thread.sleep(100);
//                //t1线程休息100毫秒
//                //t2线程抢到cpu执行权 t2线程开始执行，执行到这里的时候，t2线程休息100毫秒
//                //t3线程抢到cpu执行权，t3线程开始执行，执行到这里的时候，t3线程休息100毫秒
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            //假设线程按照顺序醒过来
//            //t1抢到cpu执行权 ，在控制台输出，窗口一正在出售第100张票
//            System.out.println(Thread.currentThread().getName()+"正在出售第"+tickets+"张票");
//            //t2抢到cpu的执行权，在控制台输出，窗口2正在出售第100张票
//            //t3抢到cpu的执行权，在控制台输出，窗口3正在出售第100张票
//            tickets--;
//            //如果这三个线程还是按照顺序来，这里就执行了三次--操作，最终票变成了97
//            }
//        }

        //出现了负数票
        while(true){
            //tickets=1
            //t1,t2,t3
            //假设t1线程抢到了cpu执行权
            if (tickets>0){
                //通过sleep方法模拟出票时间
                try {
                    Thread.sleep(100);
                    //t1线程休息100毫秒
                    //t2线程抢到cpu执行权 t2线程开始执行，执行到这里的时候，t2线程休息100毫秒
                    //t3线程抢到cpu执行权，t3线程开始执行，执行到这里的时候，t3线程休息100毫秒
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //假设线程按照顺序醒过来
                //t1抢到cpu执行权 ，在控制台输出，窗口一正在出售第1张票
                //假设t1继续拥有cpu执行权，就会执行ticket--;操作 tickets=0;
                //t2抢到cpu的执行权，在控制台输出，窗口2正在出售第0张票
                //假设t2继续拥有cpu执行权，就会执行ticket--;操作 tickets=-1;
                //t3抢到cpu的执行权，在控制台输出，窗口3正在出售第-1张票
                //假设t2继续拥有cpu执行权，就会执行ticket--;操作 tickets=-2; //这个值看不到
                System.out.println(Thread.currentThread().getName()+"正在出售第"+tickets+"张票");
                tickets--;
            }
        }
    }
}
