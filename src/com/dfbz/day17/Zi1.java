package com.dfbz.day17;

public class Zi1 implements Runnable {



    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            System.out.println(Thread.currentThread().getName()+i);

        }
    }
}
