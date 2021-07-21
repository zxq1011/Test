package com.itheima01;

import java.io.*;
/*
*    用对象序列化流序列化了一个对象以后，加入我们修改了对象所属的类文件，读取数据会不会出问题呢？
*       java.io.InvalidClassException
*       三种可能：类的串行版本与从流中描述符的类型不匹配
*               该类包含未知的数据类型
*               该类没有可访问的无参构造函数
*
*   如果出现问题了，如何解决呢？
*       给对象所属的类加一个值，private static final long serialVersionUID =42L  42L可修改
*
*   如果一个对象中的某个成员变量的值不想被序列化，又该如何实现呢？
*       private transient int age; transient修饰 标志成员变量不参与序列化过程
*
*
* */
public class ObjectStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        write();
        read();
    }
    //反序列化
    private static void read() throws IOException, ClassNotFoundException {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("itheima\\oos.txt"));
        Object obj =ois.readObject();
        Student s =(Student)obj;
        System.out.println(s.getName()+","+s.getAge());
        ois.close();
    }

    //序列化
    private static void write() throws IOException {
        ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream("itheima\\oos.txt"));
        Student s =new Student("林青霞",30);
        oos.writeObject(s);
        oos.close();
    }
}
