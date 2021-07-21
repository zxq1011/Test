package com.itheima02;

import java.io.*;
import java.util.Properties;

public class PropertiesDemo03 {
    public static void main(String[] args) throws IOException {
        //把集合中的数据保存到文件
        myStore();

        //把文件中的数据加载到集合
        myLoad();


    }

    private static void myLoad() throws IOException {
        Properties prop =new Properties();

        //void load(Reader reader)
        FileReader fr =new FileReader("itheima\\fw.txt");
        prop.load(fr);
        fr.close();
        System.out.println(prop);
    }

    private static void myStore() throws IOException {
        Properties prop =new Properties();

        prop.setProperty("itheima001","林青霞");
        prop.setProperty("itheima002","张曼玉");
        prop.setProperty("itheima003","王祖贤");

        //void store (Writer writer ,String comments)
        FileWriter fw =new FileWriter("itheima\\fw.txt");
        prop.store(fw,null);//prop.store()将数据保存在指定文件中
        fw.close();
    }
}
