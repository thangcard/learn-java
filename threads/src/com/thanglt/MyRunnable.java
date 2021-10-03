package com.thanglt;

import static com.thanglt.ThreadColor.ANSI_RED;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello from MyRunnable implementation of run()");
    }
}
