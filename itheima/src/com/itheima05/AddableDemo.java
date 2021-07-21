package com.itheima05;

public class AddableDemo {
    public static void main(String[] args) {

        //匿名内部类
        //lambda表达式
        useAddable((int x,int y)->{
//            return  x+y;
        return x-y;
        });



    }
    private static void useAddable(Addable a){
        int sum = a.add(10, 20);
        System.out.println(sum);
    }

}
