package com.itheima06;

public class MyInterfaceDemo {
    public static void main(String[] args) {
        //按照多态的方式创建对象并使用
        MyInterface my =new MyInterfaceImpOne();
        my.show1();
        my.show2();

        MyInterface my2=new MyInterfaceImpTwo();
        my2.show2();
        my2.show1();
    }
}
