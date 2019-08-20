package com.练习.day14;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest {

    public static void main(String[] args) {
        //无序
        //不能重复
        HashSet<String> set = new HashSet<>();
        set.add("扫地僧");
        set.add("扫地僧");
        set.add("扫地僧");
        set.add("扫地僧2");
        set.add("扫地僧3");
        set.add("扫地僧4");
        set.add("扫地僧5");
        set.add("马云");
        set.add("李云");

        //第一种方式遍历
//        for (String str : set) {
//            System.out.println("name:" + str);
//        }

        //第二种
        Iterator<String> it=set.iterator();
        while (it.hasNext()){
            String name=it.next();
            System.out.println("name:" + name);
        }
    }
}
