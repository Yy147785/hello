package com.dfbz.day05;

public class Test10 {

    public static void main(String[] args) {

        int[] arr={99,100,98,97,96};
        int max=arr[0];
        int min=arr[0];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(max<i){
                max=arr[i];
            }
            if(min>i){
                min=arr[i];
            }
            sum+=arr[i];


        }
        System.out.println("最终得分:"+(sum-max-min)/(arr.length-2));

    }
}
