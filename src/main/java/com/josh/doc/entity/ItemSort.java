package com.josh.doc.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class ItemSort implements Serializable {
    private Integer id;

    private Integer uid;

    private String itemSortData;

    private Date addTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getItemSortData() {
        return itemSortData;
    }

    public void setItemSortData(String itemSortData) {
        this.itemSortData = itemSortData;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}