package com.练习.day06;

public class TestBook {

    public static void main(String[] args) {

        Book book1 = new Book("yu001","语文","isbn84259",58.8,2017-01-01);
        Book book2 = new Book("shu001","数学","isbn75139",68.8,2017-02-01);
        Book book3 = new Book("ying001","英语","isbn59714",78.8,2017-03-01);

        Book book = book1;
        if (book1.getJiage()<book2.getJiage()){
            book = book2;
        }
        if (book1.getJiage()<book3.getJiage()){
            book = book3;
        }


        System.out.println(book.getTushubianhao()+" "+book.getShuming()+" "+book.getISBN编码()+" "+book.getJiage()+" "+book.getChubanriqi());






    }
}
