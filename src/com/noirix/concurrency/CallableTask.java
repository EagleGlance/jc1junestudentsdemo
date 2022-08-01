package com.noirix.concurrency;

import java.util.concurrent.Callable;

public class CallableTask implements Callable<String> {

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return "Some String" + Thread.currentThread().getId();
    }
}
