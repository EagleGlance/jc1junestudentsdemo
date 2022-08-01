package com.noirix.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceTest {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(10);
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();

//        fixedThreadPool.submit(new Run());
//        fixedThreadPool.submit(new Run());
//        fixedThreadPool.submit(new Run());
//        fixedThreadPool.submit(new Run());

        cachedThreadPool.submit(new Run());
        cachedThreadPool.submit(new Run());
        cachedThreadPool.submit(new Run());

        // Termination on cache thread pool invoke all threads death
        //cachedThreadPool.awaitTermination(6, TimeUnit.SECONDS);
        cachedThreadPool.submit(new Run());
        cachedThreadPool.shutdown();

        CallableTask callableTask = new CallableTask();
        CallableTask callableTask1 = new CallableTask();
        CallableTask callableTask2 = new CallableTask();

        List<Callable<String>> tasks = new ArrayList<>();
        tasks.add(callableTask);
        tasks.add(callableTask);
        tasks.add(callableTask);
        tasks.add(callableTask);
        tasks.add(callableTask1);
        tasks.add(callableTask1);
        tasks.add(callableTask1);
        tasks.add(callableTask1);
        tasks.add(callableTask2);
        tasks.add(callableTask2);
        tasks.add(callableTask2);
        tasks.add(callableTask2);
        tasks.add(callableTask2);
        tasks.add(callableTask2);
        tasks.add(callableTask2);
        tasks.add(callableTask2);
        tasks.add(callableTask2);
        tasks.add(callableTask2);

//        List<Future<String>> futures = fixedThreadPool.invokeAll(tasks, 4, TimeUnit.SECONDS);
//
//        for (Future<String> future : futures) {
//            if (future.isDone()) {
//                System.out.println(future.get());
//            }
//        }
//
//        fixedThreadPool.shutdown();


        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(10);
        ScheduledFuture<String> schedule = scheduledExecutorService.schedule(callableTask, 5, TimeUnit.SECONDS);

        Thread.sleep(10000);

        if (schedule.isDone()) {
            System.out.println(schedule.get());
        }

        scheduledExecutorService.shutdown();

    }
}
