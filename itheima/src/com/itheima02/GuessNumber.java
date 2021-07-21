package com.itheima02;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private GuessNumber() {
    }

    public static void start() {
        //随机生成一个1-100的数字
        Random r = new Random();
        int number = r.nextInt(100) + 1;

        while (true) {
            //键盘录入数字
            Scanner sc = new Scanner(System.in);

            System.out.println("请输入一个你要猜的数字：");
            int guessNumber = sc.nextInt();
            //比较输入数字和系统产生数字数据判断
            if (guessNumber > number) {
                System.out.println("你猜的数字" + guessNumber + "太大了");
            } else if (guessNumber < number) {
                System.out.println("你猜的数字" + guessNumber + "太小了");
            } else {
                System.out.println("恭喜你猜中了");
                break;
            }


        }
    }
}
