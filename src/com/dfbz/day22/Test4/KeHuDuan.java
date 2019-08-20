package com.dfbz.day22.Test4;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class KeHuDuan {

    public static void main(String[] args) {

        System.out.println("客户端 发送数据！");
        try {
            Socket s = new Socket("localhost",8888);
            OutputStream os = s.getOutputStream();
            os.write("哈哈哈".getBytes());
            os.close();
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
