package com.company;

import java.io.*;
import java.net.Socket;

public class GreetingClient {
    public static void main(String[] args) {
        String serverName = args[0];
        int port = Integer.parseInt(args[1]);
        try {
            System.out.println("链接到主机：" + serverName + " ，端口号：" + port);
            Socket client = new Socket(serverName, port);
            System.out.println("远程主机地址：" + client.getRemoteSocketAddress());
            OutputStream outputStream = client.getOutputStream();
            DataOutputStream out = new DataOutputStream(outputStream);

            out.writeUTF("Hello from " + client.getLocalSocketAddress());
            InputStream inputStream = client.getInputStream();
            DataInputStream in = new DataInputStream(inputStream);
            System.out.println("服务器响应：" + in.readUTF());
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
