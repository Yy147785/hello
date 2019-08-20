package com.dfbz.day07;

public class Book {

    private String  title;
    private String isbn;
    private double prive;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPrive() {
        return prive;
    }

    public void setPrive(double prive) {
        this.prive = prive;
    }

    public Book(String title, String isbn, double prive) {
        this.title = title;
        this.isbn = isbn;
        this.prive = prive;
    }

    public Book(){

    }
}
