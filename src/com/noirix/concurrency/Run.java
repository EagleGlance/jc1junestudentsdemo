package com.noirix.concurrency;

import static com.noirix.util.thread.ThreadUtil.printInfo;

public class Run implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello runnable");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        printInfo(Thread.currentThread());
    }
}
