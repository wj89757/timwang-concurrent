package com.timwang.concurrent.lock.deadlock;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author wangjun
 * @date 2020-10-25
 */
public class ThreadDeadLock {


    public static void main(String[] args) throws Exception {
        RenderPageTask renderPageTask = new RenderPageTask();
        String call = renderPageTask.call();
        System.out.println(call);
    }

}
