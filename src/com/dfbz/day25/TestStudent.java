package com.dfbz.day25;

import org.junit.Test;

import java.lang.reflect.Constructor;

public class TestStudent {

    public static void main(String[] args)throws  Exception {



        Class<Student> c = Student.class;
        Student student = c.newInstance();
        System.out.println(student);
        Student student1 = c.getConstructor().newInstance();
        System.out.println(student1);


    }
    Class<Student> clazz;


    @Test
        public void test() throws NoSuchMethodException {
            Constructor<?>[] constructors =  clazz.getDeclaredConstructors();
            for (Constructor c : constructors){
                System.out.println(c);
            }

        }




}
