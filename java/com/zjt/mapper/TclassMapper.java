package com.zjt.mapper;

import com.zjt.entity.Tclass;
import com.zjt.entity.Tuser;
import com.zjt.util.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface TclassMapper extends MyMapper<Tclass> {
    List<Tclass> selectclass();
}