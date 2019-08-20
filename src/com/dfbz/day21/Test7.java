package com.dfbz.day21;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test7 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fis  =  new FileInputStream("t.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student stu= (Student) ois.readObject();
        System.out.println(stu);
        ois.close();
        fis.close();




    }
}
