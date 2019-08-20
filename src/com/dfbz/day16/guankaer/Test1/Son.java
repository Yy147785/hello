package com.dfbz.day16.guankaer.Test1;

public class Son extends Father {



    /*@Override
    public void eat() throws BigToothPainException,FrontToothPainExcption {
        super.eat();
    }*/

    /*@Override
    public void drink() throws  BigToothPainException,FrontToothPainExcption {
        super.drink();
    }*/

    @Override
    public void drink() {

        try {

            super.drink();
            System.out.println("喝到了100度的水");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
