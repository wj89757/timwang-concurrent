package com.timwang.concurrent.thread.threadpool;

/**
 * @author wangjun
 * @date 2020-10-25
 */
public class BoundedRunnable implements Runnable {
    private final int i;

    public BoundedRunnable(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println("i am runnable : " + i);
    }
}
