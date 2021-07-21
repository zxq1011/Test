package com.itheima04;

import java.io.IOException;
import java.net.*;

public class SendDemo {
    public static void main(String[] args) throws IOException {
        //创建发送端的Socket对象（DatagramSocket）
//        DatagramSocket() 构造数据报套接字并将其绑定到本地主机上任何可用端口
        DatagramSocket ds =new DatagramSocket();

        //创建数据，并把数据打包
        //DatagramPacket(byte[] buf,int length,InetAddress address ,int port)
        //构造一个数据包，发送长度为length的数据包到指定主机上的指定端口号
        byte[] bys ="hello,udp,我来了".getBytes();
//        int length =bys.length;
//        InetAddress address = InetAddress.getByName("172.17.146.244");
//        int port =10086;
//        DatagramPacket dp =new DatagramPacket(bys,length,address,port);

        DatagramPacket dp =new DatagramPacket(bys,bys.length,InetAddress.getByName("172.17.146.244"),10086);


        //调用DatagramSocket对象的方法发送数据
        //void send(DatagramPacket p)从此套接字发送数据报包
        ds.send(dp);

        //关闭发送端
        ds.close();

    }
}
