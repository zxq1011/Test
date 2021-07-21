package com.itheima07;

public class ConverterDemo {
    public static void main(String[] args) {
//        useConverter((String s) -> {
//            return Integer.parseInt(s);});

    useConverter(s -> Integer.parseInt(s));

    //引用类方法改进
        useConverter(Integer::parseInt);
    // lambda表达式被类方法替代的时候，它的形式参数全部传递给静态方法作为参数
    }

    public  static void  useConverter(Converter c){
        int number = c.convert("666");
        System.out.println(number);
    }

}
