package com.josh.doc.dao;

import com.josh.doc.entity.Catalog;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface CatalogMapper {
    int deleteByPrimaryKey(Integer catId);

    int insert(Catalog record);

    int insertSelective(Catalog record);

    Catalog selectByPrimaryKey(Integer catId);

    int updateByPrimaryKeySelective(Catalog record);

    int updateByPrimaryKey(Catalog record);
}