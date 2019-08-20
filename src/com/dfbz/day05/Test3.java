package com.dfbz.day05;

public class Test3 {

    public static void main(String[] args) {

        int[] nums={5,10,15};
        int[] newArr=new int[nums.length];
        for(int i=0;i< newArr.length;i++){
            newArr[i]=nums[i]*2;
        }
        for(int i=0;i<nums.length;i++){
            System.out.println("nums数组："+nums[i]);
        }
        for(int i=0;i<newArr.length;i++){
            System.out.println("newArr新数组"+newArr[i]);
        }

    }
}
