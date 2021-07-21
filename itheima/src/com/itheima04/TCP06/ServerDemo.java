package com.itheima04.TCP06;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss =new ServerSocket(10000);

        Socket s = ss.accept();

        BufferedReader br =new BufferedReader(new InputStreamReader(s.getInputStream()));

        BufferedWriter bw =new BufferedWriter(new FileWriter("itheima\\server.txt"));

        String line;
        while((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();

        }

        //给出反馈
        BufferedWriter bwServer =new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        bwServer.write("文件上传成功");
        bwServer.newLine();
        bwServer.flush();

        bw.close();
        ss.close();



    }
}
