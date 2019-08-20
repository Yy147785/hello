package com.dfbz.day25.Test12;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author YY
 * @description
 * @date2019/8/2
 */
public class Test2 {
    @org.junit.Test
    public void test() throws NoSuchMethodException {
        Class<Test> c = Test.class;
        Method method = c.getMethod("show");
        Book book = method.getAnnotation(Book.class);
        String value = book.value();
        double price = book.price();
        String[] authors = book.authors();
        System.out.println(value+" "+price+" "+ Arrays.toString(authors));
    }
}
