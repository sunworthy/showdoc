package com.josh.doc.dao;

import com.josh.doc.entity.UploadFile;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface UploadFileMapper {
    int deleteByPrimaryKey(Integer fileId);

    int insert(UploadFile record);

    int insertSelective(UploadFile record);


    UploadFile selectByPrimaryKey(Integer fileId);

    int updateByPrimaryKeySelective(UploadFile record);

    int updateByPrimaryKey(UploadFile record);
}