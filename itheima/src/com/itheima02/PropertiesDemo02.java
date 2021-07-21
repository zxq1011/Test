package com.itheima02;

//properties作为集合特有的方法
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo02 {
    public static void main(String[] args) {
        //创建集合对象
        Properties prop =new Properties();

        //Object setProperty(String key ,String value) 设置集合的键和值，都是String类型，底层调用hashtable方法put
        prop.setProperty("itheima001","林青霞");
        prop.setProperty("itheima002","张曼玉");
        prop.setProperty("itheima003","王祖贤");

        //String getProperty(String key);使用此属性列表中指定的键搜索属性
        System.out.println(prop.getProperty("itheima001"));
        System.out.println(prop.getProperty("itheima0011"));
        System.out.println("--------------");

        //Set<String> stringPropertyNames() 从该属性列表中返回一个不可修改的链表，其中键及其对应的值是字符串
        Set<String> names = prop.stringPropertyNames();//set集合 随机且唯一
        for (String key:names
             ) {
           System.out.println(key);
            String value = prop.getProperty(key);
            System.out.println(key+","+value);
        }
        System.out.println("-------------");

        System.out.println(prop);
    }
}
