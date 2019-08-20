package com.dfbz.day22.Test7;

import java.io.*;
import java.net.Socket;

public class KeHuDuan {

    public static void main(String[] args) {

        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("1.txt"));
            Socket s = new Socket("localhost",6666);
            BufferedOutputStream bos = new BufferedOutputStream(s.getOutputStream());
            byte[] b=new byte[1024*8];
            int len;
            while ((len=bis.read(b))!=-1){
                String  string = new String(b,0,len);
                System.out.println("客户端收到服务器端发送过来的消息："+string);
                bos.flush();
            }
            System.out.println("文件发送完毕");
            bos.close();
            s.close();
            bis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
