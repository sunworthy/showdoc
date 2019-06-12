package com.josh.doc.service.impl;

import com.josh.doc.dao.ItemMapper;
import com.josh.doc.entity.Item;
import com.josh.doc.service.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements IItemService {
    @Autowired
    ItemMapper itemMapper;

    @Override
    public Item findById(Integer id) {
        return itemMapper.selectByPrimaryKey(id );
    }

    @Override
    public int add(Item item) {
        return itemMapper.insert(item);
    }

    @Override
    public int del(Integer id) {
        return itemMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<Item> findByUid(Integer uid) {
        return itemMapper.selectByUid(uid);
    }
}
