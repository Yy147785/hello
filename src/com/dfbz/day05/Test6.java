package com.dfbz.day05;

public class Test6 {

    public static void main(String[] args) {

        int[] arr={1,2,3,4,3,2,1};
        boolean b=true;
        for(int start=0,end=arr.length-1;start<=end;start++,end--){
            if(arr[start] !=arr[end]){
                b=true;
                break;
            }
        }
            System.out.println("[1,2,3,4,3,2,1]是否对称："+b);

    }
}
