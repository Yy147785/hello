package com.dfbz.day08;

public class Test8 {

    public static void main(String[] args) {

       String str="javajfiewjavajfiowfjavagkljjava";
       int k=getCount(str,"java");
        System.out.println("数量"+k);
    }

    public static int getCount(String str,String ch){
        int count=0;
        while(str.indexOf(ch)!=-1){
            int i=str.indexOf(ch);
            str = str.substring(i+ch.length());

            count++;
        }
        return  count;
    }

}
