package com.itheima04.UDP.example;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds =new DatagramSocket(12345);

        while(true) {
            byte[] bys = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bys, bys.length);

            ds.receive(dp);

            //解析数据包
            System.out.println("数据是：" + new String(dp.getData(), 0, dp.getLength()));
        }
    }
}
