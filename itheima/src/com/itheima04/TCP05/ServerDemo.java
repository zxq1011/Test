package com.itheima04.TCP05;

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

        bw.close();
        ss.close();

    }
}
