package com.dfbz.day22.Test3;

import java.io.IOException;
import java.net.*;

public class Client {

    public static void main(String[] args) {

        try {
            DatagramSocket ds = new DatagramSocket(8001);
            String str= "Hello world";   //要要送的数据
            DatagramPacket dp = new DatagramPacket(str.getBytes(),str.length(), InetAddress.getByName("localhost"),8001);
            ds.close();
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
