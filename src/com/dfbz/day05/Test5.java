package com.dfbz.day05;

public class Test5 {

    public static void main(String[] agrs) {

        int[] arr = {95, 92, 75, 56, 98, 71, 80, 58, 91, 91};

        int avg = getAvg(arr);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > avg) {
                count++;
            }
        }
            System.out.println("高于平均分：" + avg + "的个数有" + count + "个");
    }

    public static int getAvg(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];



        }
           return sum / arr.length;
    }

}
