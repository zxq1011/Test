package com.itheima04.TCP07;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s =new Socket("172.17.89.164",10000);

        BufferedReader br =new BufferedReader(new FileReader("itheima\\oos.txt"));

        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line;
        while ((line= br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        s.shutdownOutput();

        BufferedReader brClient =new BufferedReader(new InputStreamReader(s.getInputStream()));
        String data =brClient.readLine();
        System.out.println("服务器给出的反馈是"+data);

        s.close();
        br.close();




    }
}
