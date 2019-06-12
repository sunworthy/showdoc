package com.josh.doc.dao;

import com.josh.doc.entity.ItemMember;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;


@Mapper
@Component
public interface ItemMemberMapper {
    int deleteByPrimaryKey(Integer itemMemberId);

    int insert(ItemMember record);

    int insertSelective(ItemMember record);

    ItemMember selectByPrimaryKey(Integer itemMemberId);

    int updateByPrimaryKeySelective(ItemMember record);

    int updateByPrimaryKey(ItemMember record);
}