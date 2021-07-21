package com.itheima04.TCP;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //创建服务器端的Socket对象（ServerSocket）
        ServerSocket ss=new ServerSocket(10000);

        //Socket accept（）侦听要连接到此套接字并接收它
        Socket s =ss.accept();

        //获取输入流，读数据，并把数据显示在控制台
        InputStream is =s.getInputStream();
        byte[] bys =new byte[1024];
        int len =is.read(bys);
        String data =new String(bys,0,len);
        System.out.println("数据是："+data);

        //释放资源
        s.close();
        ss.close();
        is.close();
    }
}
