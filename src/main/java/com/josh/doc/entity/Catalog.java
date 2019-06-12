package com.josh.doc.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Catalog implements Serializable {
    private Integer catId;

    private String catName;

    private Integer itemId;

    private Integer sNumber;

    private Date addTime;

    private Integer parentCatId;

    private Integer level;

    private static final long serialVersionUID = 1L;

    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getsNumber() {
        return sNumber;
    }

    public void setsNumber(Integer sNumber) {
        this.sNumber = sNumber;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Integer getParentCatId() {
        return parentCatId;
    }

    public void setParentCatId(Integer parentCatId) {
        this.parentCatId = parentCatId;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}