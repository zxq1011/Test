package com.itheima04;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ReceiveDemo {
    public static void main(String[] args) throws IOException{
        //创建接收端的Socket对象（DatagramSocket）
        DatagramSocket ds =new DatagramSocket(10086);

        //创建一个数据包，用于接收数据
        //DatagramPacket(byte[]buf ,int length)构造一个DatagramPacket用于接受长度为length数据包
        byte[] bys =new byte[1024];
        DatagramPacket dp =new DatagramPacket(bys,bys.length);

        //调用DataGramSocket对象的方法接受数据
        ds.receive(dp);

        //解析数据包，并把数据在控制台显示
        //byte[] getData()返回数据缓冲区
//        byte[] datas =dp.getData();
//        int len =dp.getLength();
//        String dataString =new String(datas,0,len);
//        System.out.println("数据是："+dataString);
        System.out.println("数据是："+new String(dp.getData(),0,dp.getLength()));

        //关闭接受端
        ds.close();
    }
}
