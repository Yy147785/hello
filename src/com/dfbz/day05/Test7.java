package com.dfbz.day05;

public class Test7 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 3, 2, 1};
        int[] arr1 = {1, 2, 3, 4, 3, 2, 1};

        System.out.println("是否一致:" + equals(arr, arr1));
    }

    public static boolean equals(int[] arr, int[] arr1) {
        if (arr1.length != arr1.length) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr1[i]) {

                return false;
            }
        }
        return true;

    }
}
