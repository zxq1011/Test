package com.itheima04.TCP05;

import java.io.*;
import java.net.Socket;

public class CilentDemo {
    public static void main(String[] args) throws IOException {
        Socket s =new Socket("172.17.89.164",10000);

        BufferedReader br =new BufferedReader(new FileReader("itheima\\pw.txt"));

        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line;
        while((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        s.close();
        br.close();
    }
}
