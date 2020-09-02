package com.timwang.concurrent.lock.pc;

/**
 * @author wangjun
 * @date 2019-10-09
 */
public final class PCData {
    private final int intData;
    public PCData(int d) {
        intData = d;
    }
    public PCData(String d) {
        intData = Integer.valueOf(d);
    }

    public int getIntData() {
        return intData;
    }
}
