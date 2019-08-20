package com.dfbz.day13;



import java.util.ArrayList;
import java.util.Collections;

public class Test7 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"a","b","c","a","f","a","a","b","c","c");
        System.out.println( frequency(list,"a"));
    }

    public static int frequency(ArrayList<String> arr,String key){
        int count=0;
        for (String a : arr){
            if (a.equals(key)){
                count++;
            }
        }


        return count;
    }
}



