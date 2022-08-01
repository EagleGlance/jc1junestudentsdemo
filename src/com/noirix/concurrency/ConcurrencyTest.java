package com.noirix.concurrency;

import com.noirix.domain.Cat;

import java.util.Arrays;
import java.util.Comparator;

public class ConcurrencyTest {
    public static void main(String[] args) {

        CustomThread customThread = new CustomThread();
        customThread.setPriority(Thread.MAX_PRIORITY);
        customThread.start();

        Run run = new Run();
        Thread thread = new Thread(run);
        thread.setPriority(Thread.MIN_PRIORITY);
        thread.setDaemon(false);
        thread.start();
        System.out.println();





    }
}
