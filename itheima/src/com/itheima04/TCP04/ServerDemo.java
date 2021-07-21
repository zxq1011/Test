package com.itheima04.TCP04;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.SortedSet;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss =new ServerSocket(10000);

        Socket s = ss.accept();

        BufferedReader br =new BufferedReader(new InputStreamReader(s.getInputStream()));
        //写数据到文本文件
        BufferedWriter bw =new BufferedWriter(new FileWriter("itheima\\server.txt",true));

        String line;
        while((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        //释放资源
        ss.close();
//        s.close();
        bw.close();
    }
}
