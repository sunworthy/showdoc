package com.josh.doc.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class TeamMember implements Serializable {
    private Integer id;

    private Integer teamId;

    private Integer memberUid;

    private String memberUsername;

    private Date addTime;

    private Date lastUpdateTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public Integer getMemberUid() {
        return memberUid;
    }

    public void setMemberUid(Integer memberUid) {
        this.memberUid = memberUid;
    }

    public String getMemberUsername() {
        return memberUsername;
    }

    public void setMemberUsername(String memberUsername) {
        this.memberUsername = memberUsername;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
}