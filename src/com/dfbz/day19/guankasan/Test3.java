package com.dfbz.day19.guankasan;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Test3 {

    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);
        System.out.println("请输入文件路径:");
        String str = input.next();
        File file = new File(str);
        HashMap<String,Integer> map = new HashMap<>();
        getMap(file,map);
        Set<String> set = map.keySet();
        for (String s : set){
            String k=s;
            Integer v = map.get(k);
            System.out.println(k+" "+v);
        }
    }


        public static Integer num1 =0;
        public static Integer num2 =0;
        public static Integer num3 =0;
        public static void getMap(File dir,HashMap<String,Integer> map){
            File[] files = dir.listFiles();
            for(File file:files){
                if(file.isFile()){
                    if (file.getName().endsWith(".java")){
                        map.put("java",++num1);
                    }
                    if (file.getName().endsWith(".doc")){
                        map.put("doc",++num2);
                    }
                    if (file.getName().endsWith(".txt")){
                        map.put("txt",++num3);
                    }
                }else {
                    getMap(file,map);
                }

            }



        }
    }

