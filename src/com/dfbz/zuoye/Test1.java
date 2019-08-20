package com.dfbz.zuoye;

import java.util.Scanner;

/**
 * @author YY
 * @description
 * @date2019/8/3
 */


public class Test1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("请输入一行字符串：");
        String str = input.nextLine();
        char[] ch = str.toCharArray();
        int digital=0,letters=0,other=0,blank=0;
        for (int i=0;i<ch.length;i++){
            if (ch[i]>='a' && ch[i]<='z' || ch[i]>='A' && ch[i]<='Z'){
                letters++;
            }else if (ch[i]>='0' && ch[i]<='9'){
                digital++;
            }else if (ch[i] ==' '){
                blank++;
            }else{
                other++;
            }
        }
        System.out.println("字母个数："+letters);
        System.out.println("数字个数："+digital);
        System.out.println("空格个数："+blank);
        System.out.println("其他个数："+other);


    }
}
