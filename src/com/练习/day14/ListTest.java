package com.练习.day14;

import java.util.ArrayList;

public class ListTest {
    public static void main(String[] args) {

        //有序
        //可以重复
        ArrayList<String> list = new ArrayList<>();
        list.add("李云");
        list.add("马云");
        list.add("扫地僧");
        list.add("扫地僧");
        list.add("扫地僧");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
