package com.itheima01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //ObjectInputStream(InputStream in) 创建从指定的InputStream读取的ObjectInputStream
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("itheima\\oos.txt"));

        // Object readObject（）从ObjectInputStream读取一个对象
        Object obj = ois.readObject();

        //向下转型
        Student s =(Student) obj;
        System.out.println(s.getName()+","+s.getAge());

        ois.close();

    }
}
