package com.josh.doc.dao;

import com.josh.doc.entity.TeamItem;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface TeamItemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TeamItem record);

    int insertSelective(TeamItem record);

    TeamItem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TeamItem record);

    int updateByPrimaryKey(TeamItem record);
}