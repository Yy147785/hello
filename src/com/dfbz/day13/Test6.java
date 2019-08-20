package com.dfbz.day13;


import java.util.ArrayList;
import java.util.Collection;

public class Test6 {

    public static void main(String[] args) {


        Collection<String> list = new ArrayList<>();
        list.add("杨勇");
        function(list);
        Collection<Integer>list2 = new ArrayList<>();
        list2.add(123);
        function(list2);


    }
    public static void function(Collection<?> collection){
        System.out.println(collection);
    }
}
