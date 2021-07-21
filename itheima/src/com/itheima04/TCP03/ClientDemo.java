package com.itheima04.TCP03;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s =new Socket("172.17.89.164",10000);

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        //封装输出流对象
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line;
        while((line=br.readLine())!=null){
            if("886".equals(line)){
                break;
            }
            //获取输出流对象
//            OutputStream os = s.getOutputStream();
//            os.write(line.getBytes());
            bw.write(line);
            bw.newLine();
            bw.flush();

        }
        //释放资源
        s.close();
    }
}
