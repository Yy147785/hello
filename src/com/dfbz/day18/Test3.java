package com.dfbz.day18;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test3 {

    public static void main(String[] args) {

        Runnable r = new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                int avg = 0;
                for (int i = 0; i < 10; i++) {
                    sum += (1 + Math.random() * 100);

                }
                avg = sum / 10;
                String name = Thread.currentThread().getName();
                System.out.println(name + "生成的随机数的平均值是:" + avg);
            }
        };


        ExecutorService service = Executors.newFixedThreadPool(3);
        service.submit(r);
        service.submit(r);
        service.submit(r);


    }


}
