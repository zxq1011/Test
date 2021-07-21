package com.itheima01;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID =42L;
    private String name;
//    private int age;

    private transient int age;//被transient修饰的关键字 不参与序列化

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
