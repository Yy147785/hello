package com.dfbz.day18;

public class TestInvokeDirect {

    public static void main(String[] args) {
        new Thread(()->System.out.println("导演拍电影啦！")).start();

        invokeDirect(() ->{
            System.out.println("导演拍电影啦！！");
        });

        invokeDirect(() -> System.out.println("导演拍电影啦！！！"));





    }

    private static  void invokeDirect(Director director){
        director.makeMovie();

    }
}
