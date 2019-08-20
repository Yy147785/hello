package com.dfbz.day21;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class TestStudent {

    public static void main(String[] args) throws IOException {

        Student s = new Student("张三",18,"男");

        FileOutputStream fos = new FileOutputStream("t.txt",true);
        ObjectOutputStream out =new ObjectOutputStream(fos);
        out.writeObject(s);
        out.close();
        fos.close();


    }
}
