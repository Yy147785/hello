package com.dfbz.day17;

public class Test4 {

    public static void main(String[] args) {

        Runnable r = new Runnable() {
            @Override
            public void run() {

                for (int i = 0; i < 5; i++) {

                    System.out.println( "播放背景音乐："+ i);

                }
            }
        };
         new Thread(r).start();


        for (int i = 0; i < 5; i++) {
            System.out.println("显示画面"+i);

        }



    }
}
