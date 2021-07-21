package com.itheima07;

public class PrinterDemo {
    public static void main(String[] args) {

    usePrinter((String s)->{
//        String result=s.toUpperCase();
//        System.out.println(result);
        System.out.println(s.toUpperCase());
    });

    usePrinter(s -> System.out.println(s.toUpperCase()));
    System.out.println("----------");


        PrintString ps =new PrintString();
        usePrinter(ps::printUpper);
    //lambda表达式被对象的实例方法替代的时候，它的形式参数全部传递给该方法作为参数




    }
    public static void usePrinter(Printer p){
        p.printUpperCase("hello,world");

    }
}
