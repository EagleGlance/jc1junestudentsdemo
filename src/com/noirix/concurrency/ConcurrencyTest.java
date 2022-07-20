package com.noirix.concurrency;

public class ConcurrencyTest {
    public static void main(String[] args) {

        CustomThread customThread = new CustomThread();
        customThread.start();

        Run run = new Run();
        Thread thread = new Thread(run);
        thread.start();
        System.out.println();

    }
}
