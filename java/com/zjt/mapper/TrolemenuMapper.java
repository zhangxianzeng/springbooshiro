package com.zjt.mapper;

import com.zjt.entity.Trolemenu;
import com.zjt.util.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface TrolemenuMapper extends MyMapper<Trolemenu> {
}