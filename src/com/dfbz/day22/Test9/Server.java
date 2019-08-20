package com.dfbz.day22.Test9;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class Server {
    public static void main(String[] args) throws Exception {
        //服务端
        System.out.println("服务端启动");
        ServerSocket serverSocket = new ServerSocket(8007);
        Socket accept = serverSocket.accept();
        BufferedInputStream inputStream = new BufferedInputStream(accept.getInputStream());
        BufferedOutputStream outputStream = new BufferedOutputStream(accept.getOutputStream());
        while (true) {
            int len = 0;
            byte[] bytes = new byte[1024];
            while ((len = inputStream.read(bytes)) != -1) {
                String s = new String(bytes);
                String s1 = s.substring(0, s.indexOf("-"));
                if (s1.equals("copy")) {
                    String targetFileName = "e:\\test\\" + UUID.randomUUID().toString() + ".txt";
                    outputStream = new BufferedOutputStream(new FileOutputStream(targetFileName));
                }
                outputStream.write(bytes, 0, len);
                outputStream.flush();
            }
            if (false) {
                break;
            }
        }
        outputStream.close();
        inputStream.close();


    }

    public static void jieMethod1() throws Exception {
        System.out.println("服务端启动");
        ServerSocket serverSocket = new ServerSocket(8007);
        Socket accept = serverSocket.accept();
        InputStream inputStream = accept.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String readLine = reader.readLine();
        System.out.println(readLine);
        Thread.sleep(50);
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
        writer.write("服务器已接收");
        writer.flush();
        writer.close();
        reader.close();
        accept.close();
    }
}