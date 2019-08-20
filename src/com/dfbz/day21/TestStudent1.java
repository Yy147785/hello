package com.dfbz.day21;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class TestStudent1 {

    public static void main(String[] args) {

        ArrayList<Student1> list = new ArrayList<>();
        list.add(new Student1("张三",18,"男"));
        list.add(new Student1("李四",20,"男"));
        list.add(new Student1("王五",22,"男"));

        try {
            ObjectOutputStream out= new ObjectOutputStream(new FileOutputStream("stus_UTF-8.txt"));
            out.writeObject(list);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
