package com.itheima05;

public class FlyableDemo {
    public static void main(String[] args) {
        //在主方法里调用useFlyable方法
        //匿名内部类
        useFlyable(new Flyable() {
            @Override
            public void fly(String s) {
                System.out.println(s);
                System.out.println("飞机自驾游");
            }
        });
        System.out.println("---------");
        //lambda
        useFlyable((String s)->{
            System.out.println(s);
            System.out.println("飞机自驾游");
        });

    }
    private static void useFlyable(Flyable f){
        f.fly("风和日丽，晴空万里");
    }
}
