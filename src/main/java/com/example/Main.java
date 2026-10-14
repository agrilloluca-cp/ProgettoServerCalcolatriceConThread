package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");

        ServerSocket ss = new ServerSocket(3001);
        do {

            Socket s = ss.accept();
            MioThread t = new MioThread(s);
            t.start();

        } while (true);
        
    }
}

   