package com.dfbz.day21;

import java.io.*;
import java.util.Scanner;

public class Test4 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\data.txt"));
        Scanner input = new Scanner(System.in);
        for (int i=0;i<3;i++){
            System.out.println("请输入验证码：");
            String str = input.next();
            bw.write(str+"\r\n");
        }
        System.out.println("输入完成！");
        bw.close();
        Scanner input1 = new Scanner(System.in);
        System.out.println("请输入校验码：");
        BufferedReader br  =  new BufferedReader(new FileReader("C:\\data.txt"));
        String string=null;
        if ((string=br.readLine())!=null && string.equals(input1.next())){
            System.out.println("验证成功1");
        }else{
            System.out.println("验证失败");
        }
        br.close();





    }
}
