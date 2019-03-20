package com.sanayard.mybatis;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SmpUserDao {
    SmpUserPo getByUserId(Long userId);
    int insert(SmpUserPo smpUserPo);
    int updateByUserId(SmpUserPo smpUserPo);
    int deleteByUserId(Long userId);
}
