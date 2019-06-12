package com.josh.doc.dao;

import com.josh.doc.entity.ItemTop;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface ItemTopMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ItemTop record);

    int insertSelective(ItemTop record);

    ItemTop selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ItemTop record);

    int updateByPrimaryKey(ItemTop record);
}