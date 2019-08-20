package com.dfbz.day06;

public class TestBook {

    public static void main(String[] args) {

        Book book = new Book();

        Book  b1=new Book("001","语文","isbn8767578313",52.5,"Date");
        Book  b2=new Book("002","数学","isbn8767987527",165.5, "Date");
        Book  b3=new Book("003","英语","isbn9546261753",72.5, "Date");
        Book book1 = b1;
        if(book1.getMoney()<b2.getMoney()){
            book1 = b2;
        }
        if(book1.getMoney()<b3.getMoney()){
            book1=b3;
        }
        System.out.println("最贵的书是:"+book1.getNumber()+book1.getName()+book1.getISBN()+" "+book1.getMoney()+book1.getDate());

    }
}
