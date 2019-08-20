package com.dfbz.day18;

public abstract class Test5 implements Runnable {

    public static void main(String[] args) {
        /*Thread t = new Thread(new Test5());
        t.start();*/
    }

    /*@Override*/
    public void run(int num) {
        for (int i = 0; i <num ; i++) {
            System.out.println(i);

        }

    }


    //报错
    //不是抽象类，要加一个抽象的类型
    // 显示方法不会覆盖或实现超类型的方法


}



