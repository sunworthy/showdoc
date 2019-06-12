package com.josh.doc.dao;

import com.josh.doc.entity.Item;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface ItemMapper {
    int deleteByPrimaryKey(Integer itemId);

    int insert(Item record);

    int insertSelective(Item record);

    Item selectByPrimaryKey(Integer itemId);

    List<Item> selectByUid(Integer uid);

    int updateByPrimaryKeySelective(Item record);

    int updateByPrimaryKey(Item record);
}