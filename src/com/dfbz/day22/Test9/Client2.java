package com.dfbz.day22.Test9;

import java.io.*;
import java.net.Socket;

public class Client2 {
    public static void main(String[] args) throws Exception{
        //客户端2
        System.out.println("客户端2启动");
        Socket socket = new Socket("localhost", 8007);
        BufferedOutputStream outputStream = new BufferedOutputStream(socket.getOutputStream());
        BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream("text2.txt"));
        int len;
        byte[] bytes = new byte[1024];
        while ((len=inputStream.read(bytes))!=-1){
            outputStream.write(bytes, 0, len);
            outputStream.flush();
        }

        inputStream.close();
        outputStream.close();
        socket.close();
    }
}