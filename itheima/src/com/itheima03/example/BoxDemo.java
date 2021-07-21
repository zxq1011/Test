package com.itheima03.example;
/*
 *   生产者消费者案例中包含的类：
 *       1、奶箱类（Box）：定义一个成员变量，表示第x瓶奶，提供存储牛奶和获取牛奶的操作
 *       2、生产者类（Producer）:实现Runnable接口，重写run（）方法，调用存储牛奶的操作
 *       3、消费者列（Customer）：实现Runnable接口，重写run（）方法，调用获取牛奶的操作
 *       4、测试类（BoxDemo）:里面有main方法，main方法中的代码步骤如下：
 *           A：创建奶箱对象，这是共享数据区域
 *           B：创建生产者对象，把奶箱对象作为构造方法传递参数，因为在这个类中要调用存储牛奶的操作
 *           C：创建消费者对象，把奶箱对象作为构造方法传递参数，因为在这个类中要调用获取牛奶的操作
 *           D:创建两个线程，分别把生产者对象和消费者对象作为构造方法传递参数
 *           E：启动线程
 * */
public class BoxDemo {
    public static void main(String[] args) {
//        A：创建奶箱对象，这是共享数据区域
             Box b =new Box();

//        B：创建生产者对象，把奶箱对象作为构造方法传递参数，因为在这个类中要调用存储牛奶的操作
            Producer p =new Producer(b);

//        C：创建消费者对象，把奶箱对象作为构造方法传递参数，因为在这个类中要调用获取牛奶的操作
            Customer c =new Customer(b);

//        创建两个线程，分别把生产者对象和消费者对象作为构造方法传递参数
            Thread t1 =new Thread(p);
            Thread t2 =new Thread(c);

            t1.start();
            t2.start();

    }
}
