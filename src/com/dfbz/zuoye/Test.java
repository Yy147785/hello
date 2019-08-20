package com.dfbz.zuoye;

import java.util.Scanner;

/**
 * @author YY
 * @description
 * @date2019/8/3
 */


public class Test {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("请输入总人数：");
        int num = input.nextInt();
        int[] arr = new int[num];
        for (int i =0;i<num;i++){
            arr[i]=1;
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        int index=0;
        int sum=0;
        while (num>1){
            if (arr[index]==1){
                sum++;
                if (sum==3){
                    sum=0;
                    arr[index]=0;
                    num--;
                }
            }
            index++;
            if (index==arr.length){
                index=0;
            }
            for (int i = 0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
            for (int i = 0; i <arr.length ; i++) {
                if (arr[i]==1){
                    System.out.println("第"+(i+1)+"留了下来");
                }

            }

        }



    }
}
