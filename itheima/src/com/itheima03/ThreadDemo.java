package com.itheima03;

import java.util.*;

public class ThreadDemo {
    public static void main(String[] args) {
        StringBuffer sb =new StringBuffer();
        StringBuilder sb2=new StringBuilder();

        Vector<String> v =new Vector<String>();
        ArrayList<String> array =new ArrayList<String>();

        Hashtable<String,String> hs =new Hashtable<String,String>();
        HashMap<String,String>  hm =new HashMap<String ,String>();

        //static<T> List<T> synchronizedList(List<T> list)返回指定列表支持的同步（线程安全）列表
        List<String> list = Collections.synchronizedList(new ArrayList<String>());

    }
}
