package com.tingo.data.bean;

import com.tingo.data.annotations.Document;
import com.tingo.data.annotations.Field;
import com.tingo.data.annotations.ID;

import java.util.Date;

/**
 * Created by tengfei on 2017/1/29.
 */
@Document(index="",type="",shards = ,replicas = )
public class Product {
    @ID
    private Long id;
    @Field
    private String name;
    private String madeIn;
    private Date madeDate;
    private String standard;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    public Date getMadeDate() {
        return madeDate;
    }

    public void setMadeDate(Date madeDate) {
        this.madeDate = madeDate;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }
}
