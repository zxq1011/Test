package com.itheima05;
//lambda注意事项:使用lambda必须要有接口，并且要求接口中有且只有一个抽象方法
public class LambdaDemo03 {
    public static void main(String[] args) {
/*
        useInter(()->{
            System.out.println("好好学习，天天向上");
        });
*/
        useInter(()-> System.out.println("好好学习，天天向上"));


      //!!!!!必须有上下文环境，才能推导出Lambda对象接口!!!!!
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("匿名内部类");
//            }
//        }).start();
//
//        Runnable r = () -> System.out.println("Lambda表达式");
//        new Thread(r).start();

        new Thread(()-> System.out.println("Lambda表达式")).start();

    }
    private static void useInter(Inter i){
        i.show();
    }

}
