package com.josh.doc.dao;

import com.josh.doc.entity.PageHistory;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface PageHistoryMapper {
    int deleteByPrimaryKey(Integer pageHistoryId);

    int insert(PageHistory record);

    int insertSelective(PageHistory record);

    PageHistory selectByPrimaryKey(Integer pageHistoryId);

    int updateByPrimaryKeySelective(PageHistory record);

    int updateByPrimaryKey(PageHistory record);
}