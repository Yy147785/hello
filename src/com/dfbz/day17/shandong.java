package com.dfbz.day17;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class shandong implements  Runnable {


    private int people=10;

    Random r = new Random();




    @Override
    public void run() {
        while(true){
            if (people>0){
                try{
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                String name = Thread.currentThread().getName();
                System.out.println(name+"正在过山洞"+people--);
            }

        }



    }




}
