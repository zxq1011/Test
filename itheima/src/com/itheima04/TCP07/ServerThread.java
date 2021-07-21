package com.itheima04.TCP07;

import java.io.*;
import java.net.Socket;

public class ServerThread implements Runnable {
    private Socket s;

    public ServerThread(Socket s) {
        this.s=s;
    }

    @Override
    public void run() {
        try {
            BufferedReader br =new BufferedReader(new InputStreamReader(s.getInputStream()));

//            BufferedWriter bw =new BufferedWriter(new FileWriter("itheima\\Server.txt"));
            int count=0;
            File file =new File("itheima\\Server["+count+"].txt");
            while (file.exists()){
                count++;
                file =new File("itheima\\Server["+count+"].txt");
            }

            BufferedWriter bw =new BufferedWriter(new FileWriter(file));

            String line;
            while ((line=br.readLine())!=null){
                bw.write(line);
                bw.newLine();
                bw.flush();
            }

            //反馈
            BufferedWriter bwServer =new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            bwServer.write("文件上传成功");
            bwServer.newLine();
            bwServer.flush();

            s.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
