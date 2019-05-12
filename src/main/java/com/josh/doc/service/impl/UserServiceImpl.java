package com.josh.doc.service.impl;

import com.josh.doc.dao.UserMapper;
import com.josh.doc.entity.User;
import com.josh.doc.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public int insert(User record) {
        return userMapper.insert(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer uid) {
        return userMapper.deleteByPrimaryKey(uid);
    }

    @Override
    public User selectByPrimaryKey(Integer uid) {
        return userMapper.selectByPrimaryKey(uid);
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return 0;
    }

    @Override
    public User selectByNamePwd(String username, String password) {
        return null;
    }
}
