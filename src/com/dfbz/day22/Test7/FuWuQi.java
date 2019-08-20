package com.dfbz.day22.Test7;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class FuWuQi {

    public static void main(String[] args) {

        System.out.println("服务器启动....");
        try {
            ServerSocket ss = new ServerSocket(6666);
            Socket s = ss.accept();
            BufferedInputStream bis = new BufferedInputStream(s.getInputStream());
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("abc.txt"));
            byte[] b = new byte[1024*8];
            int len;
            while((len=bis.read())!=-1){
                String string = new String(b,0,len);
                System.out.println("服务器收到客户端发送的消息："+string);
            }
            bos.close();
            bis.close();
            s.close();
            System.out.println("文件上传已保存");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
