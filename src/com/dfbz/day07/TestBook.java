package com.dfbz.day07;

import java.util.ArrayList;
import java.util.Scanner;

public class TestBook {

    public static void main(String[] args) {

        ArrayList<Book> list = new ArrayList<>();


        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入第" + (i + 1) + "本书的名称:");
            String a = input.next();
            System.out.println("请输入第" + (i + 1) + "本书的ISBN编码:");
            String b = input.next();
            System.out.println("请输入第" + (i + 1) + "本书的价格:");
            double c = input.nextInt();
            Book book = new Book(a,b,c);
            list.add(book);
        }
        for (int n = 0; n < list.size(); n++) {
            Book book =  list.get(n);
            System.out.println(list.get(n).getTitle()+" "+list.get(n).getIsbn()+" "+list.get(n).getPrive());
        }
    }
}
