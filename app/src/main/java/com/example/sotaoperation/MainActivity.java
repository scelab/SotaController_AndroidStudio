package com.example.sotaoperation;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    String address = "192.168.11.22";
    String strPort = "22222";
    int port = Integer.parseInt(strPort);
    // Called when the user taps the Send button
    public void sendMessage1(View view) {
        Runnable sender = new Runnable() {
            @Override
            public void run() {

                Socket socket = null;

                try {
                    socket = new Socket(address, port);
                    PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
                    pw.println("1");
                } catch (UnknownHostException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (socket != null) {
                    try {
                        socket.close();
                        socket = null;
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread th = new Thread(sender);
        th.start();
    }

    public void sendMessage2(View view) {
        Runnable sender = new Runnable() {
            @Override
            public void run() {

                Socket socket = null;

                try {
                    socket = new Socket(address, port);
                    PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
                    pw.println("2");
                } catch (UnknownHostException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (socket != null) {
                    try {
                        socket.close();
                        socket = null;
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread th = new Thread(sender);
        th.start();
    }

    public void sendMessage3(View view) {
        Runnable sender = new Runnable() {
            @Override
            public void run() {

                Socket socket = null;

                try {
                    socket = new Socket(address, port);
                    PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
                    pw.println("3");
                } catch (UnknownHostException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (socket != null) {
                    try {
                        socket.close();
                        socket = null;
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread th = new Thread(sender);
        th.start();
    }

    public void sendMessage4(View view) {
        Runnable sender = new Runnable() {
            @Override
            public void run() {

                Socket socket = null;

                try {
                    socket = new Socket(address, port);
                    PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
                    pw.println("4");
                } catch (UnknownHostException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (socket != null) {
                    try {
                        socket.close();
                        socket = null;
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread th = new Thread(sender);
        th.start();
    }

    public void sendMessager(View view) {
        Runnable sender = new Runnable() {
            @Override
            public void run() {

                Socket socket = null;

                try {
                    socket = new Socket(address, port);
                    PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
                    pw.println("r");
                } catch (UnknownHostException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (socket != null) {
                    try {
                        socket.close();
                        socket = null;
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread th = new Thread(sender);
        th.start();
    }

    public void sendMessagex(View view) {
        Runnable sender = new Runnable() {
            @Override
            public void run() {

                Socket socket = null;

                try {
                    socket = new Socket(address, port);
                    PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
                    pw.println("x");
                } catch (UnknownHostException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (socket != null) {
                    try {
                        socket.close();
                        socket = null;
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread th = new Thread(sender);
        th.start();
    }
}