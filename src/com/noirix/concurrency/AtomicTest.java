package com.noirix.concurrency;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class AtomicTest {

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger();

        atomicInteger.set(15);
        atomicInteger.getAndAdd(10);
        atomicInteger.incrementAndGet();
        atomicInteger.decrementAndGet();
        atomicInteger.addAndGet(-50);

        System.out.println(atomicInteger.get());

        AtomicLong atomicLong = new AtomicLong();


    }
}
