package com.itheima04.UDP.example;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*InetAddress
        此类表示Internet协议（ip）地址

    public static InetAddress getByName(String name) 确定主机名称的ip地址 主机名称可以是机器名称 也可以是IP地址
    public String getHostName（）获取此IP地址的主机名
    public String getHostAddress（） 返回文本显示中的IP地址字符串*/
public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
//        public static InetAddress getByName(String name) 确定主机名称的ip地址 主机名称可以是机器名称 也可以是IP地址
//        InetAddress address = InetAddress.getByName("zxqworkbook");
        InetAddress address = InetAddress.getByName("172.17.89.164"); //推荐

//        public String getHostName（）获取此IP地址的主机名
        String name = address.getHostName();

//        public String getHostAddress（） 返回文本显示中的IP地址字符串
        String ip = address.getHostAddress();

        System.out.println("主机名："+name);
        System.out.println("ip地址"+ ip);


    }
}
