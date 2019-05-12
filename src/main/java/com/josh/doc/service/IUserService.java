package com.josh.doc.service;


import com.josh.doc.entity.User;

public interface IUserService {

    int insert(User record);

    int deleteByPrimaryKey(Integer uid);

    User selectByPrimaryKey(Integer uid);

    int updateByPrimaryKey(User record);

    User selectByNamePwd(String username, String password);
}
