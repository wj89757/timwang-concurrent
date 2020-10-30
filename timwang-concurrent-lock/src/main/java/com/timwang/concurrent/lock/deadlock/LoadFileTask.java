package com.timwang.concurrent.lock.deadlock;

/**
 * @author wangjun
 * @date 2020-10-25
 */
public class LoadFileTask implements Runnable {
    private String file;

    public LoadFileTask(String file) {
        this.file = file;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    @Override
    public void run() {
        System.out.println("do load file : " + file);
    }
}
