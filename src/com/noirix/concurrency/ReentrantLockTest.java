package com.noirix.concurrency;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantLockTest {

    public static void main(String[] args) {

        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();

        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();

        ReentrantLock reentrantLock = new ReentrantLock();

        reentrantLock.lock();

        /*1) custom purpose of blocking
        * 2) queue of threads before sync*/
        writeLock.lock();

        System.out.println("Hi");

        writeLock.unlock();

    }
}
