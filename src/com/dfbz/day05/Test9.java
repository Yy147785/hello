package com.dfbz.day05;

public class Test9 {

    public static  void main(String[] args){

        String[] arr={"黑桃","红桃","梅花","方片"};
        String[] arr1={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};

        for(int i=0;i<arr.length;i++){
            for(int n=0;n<arr1.length;n++){
                System.out.print(arr[i]+arr1[n]+" ");
            }
        System.out.println();
        }
    }


}
