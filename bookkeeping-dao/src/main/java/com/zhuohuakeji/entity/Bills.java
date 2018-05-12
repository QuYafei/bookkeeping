package com.zhuohuakeji.entity;

import java.sql.Date;

public class Bills {
    private Integer id;
    private String title;
    private Date bill_time;
    private Integer type_id;
    private Integer price;
    private String cxplain;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getBill_time() {
        return bill_time;
    }

    public void setBill_time(Date bill_time) {
        this.bill_time = bill_time;
    }

    public Integer getType_id() {
        return type_id;
    }

    public void setType_id(Integer type_id) {
        this.type_id = type_id;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getCxplain() {
        return cxplain;
    }

    public void setCxplain(String cxplain) {
        this.cxplain = cxplain;
    }
}
