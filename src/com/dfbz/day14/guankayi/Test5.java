package com.dfbz.day14.guankayi;


import java.util.ArrayList;

public class Test5 {

    public static void main(String[] args) {

        ArrayList<String> list= add("asd ","gg","hg");

        for (String string : list){
            System.out.println(string);
        }

    }

    public static ArrayList add(String... str){
        ArrayList<String> list = new ArrayList<>();
        for (String str1 : str){
            list.add(str1);

        }



        return list;

    }


}
