package com.timwang.concurrent.lock.deadlock;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author wangjun
 * @date 2020-10-25
 */
public class RenderPageTask implements Callable<String> {
    ExecutorService executorService = Executors.newSingleThreadExecutor();

    @Override
    public String call() throws Exception {
        Future header, footer;
        header = executorService.submit(new LoadFileTask("header.html"));
        footer = executorService.submit(new LoadFileTask("footer.html"));
        String page = renderBody();
        // 将发生
        return header.get().toString() + page + footer.get().toString();
    }

    private String renderBody() {
        return "<body></body>";
    }

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
}
