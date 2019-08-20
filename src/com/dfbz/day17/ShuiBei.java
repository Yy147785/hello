package com.dfbz.day17;

public class ShuiBei implements Runnable{

    private int shuibei=99;
    private int number = 1;

    Object object = new Object();
    @Override
    public void run() {
        while (true){

            if (shuibei>0){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (object){
                    String name = Thread.currentThread().getName();
                    System.out.println(name+"卖出了第"+number+"个"+",还剩"+shuibei--);
                    number++;
                }
            }else {
                break;
            }
        }


    }



}
