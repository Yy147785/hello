package com.dfbz.day18;

public class MyThread implements Runnable {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        new Thread(myThread, "前门").start();
        new Thread(myThread, "后门").start();
    }
    private static int num = 100;
    private static int id = 1;

    private synchronized static int show() {
        System.out.println("编号为:" + id + "从" + Thread.currentThread().getName() + "入场！拿到的双色球彩票号码是:"+DoubleColorBallUtil.create());
        return 1;
    }
    @Override
    public void run() {
        int sum = 0;
        while (num > 0) {
            num--;
            sum += show();
            id++;
        }
        System.out.println("从" + Thread.currentThread().getName() + "入场的员工共有" + sum + "人");
    }
}

