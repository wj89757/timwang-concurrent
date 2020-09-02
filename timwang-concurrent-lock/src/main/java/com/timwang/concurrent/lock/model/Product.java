package com.timwang.concurrent.lock.model;

/**
 * @author wangjun
 * @date 2019-10-03
 */
public final class Product {
    private final String no;
    private final String name;
    private final String price;

    public Product(String no, String name, String price) {
        super();
        this.no = no;
        this.name = name;
        this.price = price;
    }

    public String getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }
}
