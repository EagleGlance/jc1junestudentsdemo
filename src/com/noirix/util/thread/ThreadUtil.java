package com.noirix.util.thread;

public class ThreadUtil {
    public static synchronized void printInfo(Thread thread) {
        System.out.println("Thread info: ");
        System.out.println(thread.getId());
        System.out.println(thread.getPriority());
        System.out.println(thread.getName());
        System.out.println(thread.getState());
        System.out.println(thread.getThreadGroup());
    }
}
