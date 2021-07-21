package com.itheima04.TCP03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);


        //监听客户端连接返回一个对应的对象
        Socket s = ss.accept();


        //获取输入流
//        InputStream is = s.getInputStream();
//        InputStreamReader isr =new InputStreamReader(is);
//        BufferedReader br =new BufferedReader(isr);
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        //释放资源
        ss.close();
    }
}
