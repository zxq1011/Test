package com.itheima01;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class test {
    public static void main(String[] args) throws FileNotFoundException {
        //PrintStream(String fileName)使用指定的文件名创建新的打印流
        PrintStream ps =new PrintStream("itheima\\ps.txt");

        //写数据

        //字节输出流有的方法
//        ps.write(97);
        //使用特有方法写数据
        ps.print(97);
        ps.println();
        ps.print(98);
      
        //释放资源
        ps.close();
    }
}
