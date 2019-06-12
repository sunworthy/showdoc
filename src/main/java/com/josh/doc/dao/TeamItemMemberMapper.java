package com.josh.doc.dao;

import com.josh.doc.entity.TeamItemMember;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;


@Mapper
@Component
public interface TeamItemMemberMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TeamItemMember record);

    int insertSelective(TeamItemMember record);

    TeamItemMember selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TeamItemMember record);

    int updateByPrimaryKey(TeamItemMember record);
}