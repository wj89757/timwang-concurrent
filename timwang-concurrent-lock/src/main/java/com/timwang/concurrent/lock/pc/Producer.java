package com.timwang.concurrent.lock.pc;

import java.util.concurrent.BlockingDeque;

/**
 * @author wangjun
 * @date 2019-10-09
 */
public class Producer implements Runnable {
    private volatile boolean isRunning = true;
    private BlockingDeque<PCData> queue;

    @Override
    public void run() {

    }
}
