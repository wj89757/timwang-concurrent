package com.timwang.concurrent.thread.threadpool;

import net.jcip.annotations.ThreadSafe;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * @author wangjun
 * @date 2020-10-25
 */
@ThreadSafe
public class BoundedExecutor {
    private final Executor executor;
    private final Semaphore semaphore;

    public BoundedExecutor(Executor executor, int bound) {
        this.executor = executor;
        this.semaphore = new Semaphore(bound);
    }

    public void submitTask(final Runnable runnable) throws Exception {
        semaphore.acquire();
        try {
            executor.execute(() -> {
                try {
                    runnable.run();
                } catch (Exception e) {
                    semaphore.release();
                }
            });
        } catch (Exception e) {
            semaphore.release();
        }
    }

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 300; i++) {
            Executor executor = Runnable::run;
            BoundedExecutor boundedExecutor = new BoundedExecutor(executor, 1);
            boundedExecutor.submitTask(new BoundedRunnable(i));
        }
    }
}
