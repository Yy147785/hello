package com.dfbz.day22.Test3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class FuWuQi {

    public static void main(String[] args) {

        byte[] b = new byte[1024];  //创建一个长度为1024的字节数组，用于接收数据
        try {
            DatagramSocket ds = new DatagramSocket(8001);  //设置监听端口号为8001
            DatagramPacket dp = new DatagramPacket(b,1024);
            System.out.println("接收数据:");
            ds.receive(dp);
            String str = new String(dp.getData(),0,dp.getLength());
            System.out.println(str);
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
