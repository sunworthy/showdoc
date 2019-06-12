package com.josh.doc.dao;

import com.josh.doc.entity.Options;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface OptionsMapper {
    int deleteByPrimaryKey(Integer optionId);

    int insert(Options record);

    int insertSelective(Options record);

    Options selectByPrimaryKey(Integer optionId);


    int updateByPrimaryKeySelective(Options record);

    int updateByPrimaryKey(Options record);
}