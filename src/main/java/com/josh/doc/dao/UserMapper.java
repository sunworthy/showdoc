package com.josh.doc.dao;

import com.josh.doc.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface UserMapper {

    int insert(User record);

    int deleteByPrimaryKey(Integer uid);

    int updateByPrimaryKey(User record);

    User selectByPrimaryKey(Integer uid);
}