package com.itheima07;

public class MyStringDemo {
    public static void main(String[] args) {
        //在主方法中调用useMyString方法
        useMyString((String s,int x,int y)->{
            return s.substring(x,y);
        });

        //优化
        useMyString((s,x,y)->s.substring(x,y));

        //引用类中实例方法
        useMyString(String::substring);
        //lambda表达式被类的实例方法替代的时候：第一个参数作为调用者、后面的参数全部传递给该方法作为参数

    }

    public static void useMyString(MyString my){
        String s = my.mySubString("abcdefg", 2, 4);
        System.out.println(s);
    }



}
