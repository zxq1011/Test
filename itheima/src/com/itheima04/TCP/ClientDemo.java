package com.itheima04.TCP;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端Socket对象
        //Socket(InetAddress address,int port)创建流套接字并将其链接到指定ip地址的指定端口号
//        Socket s =new Socket(InetAddress.getByName("172.17.146.244"),10000);
        //Socket(String host,int port)创建流套接字并将其链接到指定主机上的指定端口号
           Socket s =new Socket("172.17.89.164",10000);

           //获取输出流写数据
        //OutputStream getOutputStream()返回此套接字的输出流
        OutputStream os = s.getOutputStream();
        os.write("Hello,tcp,我来了".getBytes());

        os.close();
        s.close();


    }
}
