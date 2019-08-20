package com.dfbz.day09;

public class Test3 {

    public static void main(String[] args) {

        Teacher1 teacher1 =  new Teacher1("王小平",30);
        teacher1.Teaching();

        Student student =  new Student("李小乐",14,90);
        student.kaoshi();
    }
}
