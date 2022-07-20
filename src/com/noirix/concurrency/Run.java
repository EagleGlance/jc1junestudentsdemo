package com.noirix.concurrency;

import static com.noirix.util.thread.ThreadUtil.printInfo;

public class Run implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello runnable");
        printInfo(Thread.currentThread());
    }
}
