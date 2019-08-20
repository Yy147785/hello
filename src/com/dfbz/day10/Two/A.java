package com.dfbz.day10.Two;

public interface A {

     abstract void showA();
     default  void showB(){
         System.out.println("BBBB");

     }
}
