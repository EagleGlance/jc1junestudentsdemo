package com.noirix.concurrency;

import static com.noirix.util.thread.ThreadUtil.printInfo;

public class CustomThread extends Thread {
    @Override
    public void run() {
        System.out.println("Hello Thread");
        printInfo(Thread.currentThread());
    }
}
