package com.josh.doc.service;

import com.josh.doc.entity.Item;

import java.util.List;

public interface IItemService {
    Item findById(Integer id);

    int add(Item item);

    int del(Integer id);

    List<Item> findByUid(Integer uid);
}
