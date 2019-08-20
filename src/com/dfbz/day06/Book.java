package com.dfbz.day06;

public class Book {

    private String number;
    private String name;
    private String ISBN;
    private double money;
    private String Date;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public Book(){

    }

    public Book(String number, String name, String ISBN, double money, String date) {
        this.number = number;
        this.name = name;
        this.ISBN = ISBN;
        this.money = money;
        Date = date;
    }
}
