package com.dfbz.day14.guankaer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class Test3 {



    public static void main(String[] args) {

        String[] str={"12345","67891","1","2347809933","98765432102","67891","12347809933"};

        LinkedList<String> list = new LinkedList<>();

        for (int i = 0;i<str.length;i++){

                if (!list.contains(str[i])){
                    list.add(str[i]);
                }



        }



        for (String string : list){
            System.out.println(string);
        }

        Iterator<String> it = list.iterator();
        while (it.hasNext()){
          String s=it.next();
           System.out.println(s);
        }


    }
}
