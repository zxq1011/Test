package com.itheima02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) throws IOException {
        //从文件中读取数据到Properties集合，用load（）方法实现
        Properties prop =new Properties();

        FileReader fr =new FileReader("itheima\\game.txt");
        prop.load(fr);
        fr.close();
        //通过Properties集合获取到玩游戏的次数
        String count = prop.getProperty("count");
        int number = Integer.parseInt(count);

        //判断次数是否到了三次
        if (number>=3){
//            如果到了给出提示：游戏试玩已经结束，请充值
            System.out.println("游戏试玩已结束，想玩请充值www.itcast.cn");
        }else{
            //玩游戏
            GuessNumber.start();

            //次数加1 重新写回文件
            number++;
            prop.setProperty("count",String.valueOf(number));
            FileWriter fw =new FileWriter("itheima\\game.txt");
            prop.store(fw,null);
            fw.close();
        }


    }
}
