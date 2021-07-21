package com.itheima04.TCP02;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
*   客户端：发送数据、接收服务器反馈
* */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端Socket对象
        Socket s =new Socket("172.17.89.164",10000);
        //获取输出流，写数据
        OutputStream os = s.getOutputStream();
        os.write("hello,TCP，我来了".getBytes());

        //接收服务器反馈
        InputStream is =s.getInputStream();
        byte[] bys =new byte[1024];
        int len =is.read(bys);
        String data =new String(bys,0,len);
        System.out.println("客户端："+data);

        //释放资源
        s.close();
    }
}
