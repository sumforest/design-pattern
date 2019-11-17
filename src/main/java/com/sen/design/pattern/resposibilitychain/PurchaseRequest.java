package com.sen.design.pattern.resposibilitychain;

import java.math.BigDecimal;

/**
 * @Auther: Sen
 * @Date: 2019/11/17 23:13
 * @Description:
 */
public class PurchaseRequest {

    private int type;

    private BigDecimal price;

    private int id;

    public PurchaseRequest(int type, BigDecimal price, int id) {
        this.type = type;
        this.price = price;
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
