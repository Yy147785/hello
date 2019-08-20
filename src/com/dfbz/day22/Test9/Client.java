package com.dfbz.day22.Test9;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception {
        //客户端1
        System.out.println("客户端启动");
        Socket socket = new Socket("localhost", 8007);
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("text1.txt"));
        int len;
        byte[] b = new byte[1024];
        while ((len = bis.read(b)) != -1) {
            bos.write(b, 0, len);
            bos.flush();
        }

        bis.close();
        bos.close();
        socket.close();


    }

    public static void faMethod() throws Exception {
        System.out.println("客户端启动");//有bug
        Socket socket = new Socket("localhost", 8007);
        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));
        writer.write("1号客户端");
        writer.flush();
        Thread.sleep(50);
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String readLine = reader.readLine();
        System.out.println(readLine);
        reader.close();
        writer.close();
        socket.close();
    }
}

