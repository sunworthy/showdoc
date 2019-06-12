package com.josh.doc.dao;

import com.josh.doc.entity.TeamMember;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface TeamMemberMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TeamMember record);

    int insertSelective(TeamMember record);

    TeamMember selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TeamMember record);

    int updateByPrimaryKey(TeamMember record);
}