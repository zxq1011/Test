package com.itheima05;

import jdk.swing.interop.SwingInterOpUtils;

//Lambda表达式的省略模式
/*
* 省略规则：参数类型可以省略，但多个参数情况下，不能只省略一个
*         如果参数有且只有一个，那么小括号可以省略
*         如果代码块的语句只有一条，可以省略大括号和分号，甚至return
* */
public class LambdaDemo02 {
    public static void main(String[] args) {
/*        useAddable((int x,int y)->{
            return x+y;
        });*/
        //参数的类型可以省略
        useAddable((x,y)->{
            return x+y;
        });
        //但是有多个参数的情况下，不能只省略一个 要么一起省略 要么都不省略
/*
        useFlyable((String s)->{
            System.out.println(s);
            System.out.println("飞机自驾游");
        });
*/


        useFlyable((s)->{
            System.out.println(s);
            System.out.println("飞机自驾游");
        });
        //如果参数有且只有一个，那么小括号可以省略
        useFlyable(s->{
            System.out.println(s);
        });

//        如果代码块的语句只有一条可以省略大括号和分号
        useFlyable(s-> System.out.println(s));

        //如果有return ,return也要省略
        useAddable((x,y)-> x+y);


    }

    private static void useFlyable(Flyable f){
        f.fly("风和日丽，晴空万里");
    }
    private  static void useAddable(Addable a){
        int sum =a.add(10,20);
        System.out.println(sum);
    }
}
