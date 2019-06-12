package com.josh.doc.dao;

import com.josh.doc.entity.ItemSort;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;


@Mapper
@Component
public interface ItemSortMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ItemSort record);

    int insertSelective(ItemSort record);

    ItemSort selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ItemSort record);

    int updateByPrimaryKey(ItemSort record);
}