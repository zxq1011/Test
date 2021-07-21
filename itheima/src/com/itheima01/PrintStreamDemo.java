package com.itheima01;

import java.io.*;

public class PrintStreamDemo {
    public static void main(String[] args) throws IOException {
        //PrintWriter (String fileName) 使用指定的文件名创建一个新的PrintWriter,而不需要自动执行刷新
       /* PrintWriter pw =new PrintWriter("itheima\\pw.txt");

        pw.write("hello");
        pw.write("\r\n");
        pw.flush();
        pw.write("world");
        pw.write("\r\n");
        pw.flush();


        pw.println("hello");
        pw.flush();
        pw.println("world");
        pw.flush();

        //

*/
//        PrintWriter (Writer out ,Boolean aotoFlush)创建一个新的PrintWriter
        PrintWriter pw2 =new PrintWriter(new FileWriter("itheima\\pw.txt"),true);

        pw2.println("hello");
        pw2.println("world");

        pw2.close();

    }
}
