package com.dfbz.day05;

public class Test8 {

    public static void main(String[] args){

        char [] xm={'D','C','B','A','D'};
        char [] xh={'A','D','B','C','D'};
        char [] xn={'A','D','B','C','A'};
        char [] xq={'A','B','C','D','D'};
        grade("小明",xm);
        grade("小红",xh);
        grade("小黄",xn);
        grade("小强",xq);
    }
    public  static void grade(String name,char[] arr){
        char[] answer={'A','B','C','D','E'};
        int count=0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==answer[i]){
                count++;
            }
        }
        System.out.println("满分10分，"+name+":得分:"+count*2);
    }
}
