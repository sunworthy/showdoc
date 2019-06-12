package com.josh.doc.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class ItemMember implements Serializable {
    private Integer itemMemberId;

    private Integer itemId;

    private Integer uid;

    private String username;

    private Date addTime;

    private Integer memberGroupId;

    private static final long serialVersionUID = 1L;

    public Integer getItemMemberId() {
        return itemMemberId;
    }

    public void setItemMemberId(Integer itemMemberId) {
        this.itemMemberId = itemMemberId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Integer getMemberGroupId() {
        return memberGroupId;
    }

    public void setMemberGroupId(Integer memberGroupId) {
        this.memberGroupId = memberGroupId;
    }
}