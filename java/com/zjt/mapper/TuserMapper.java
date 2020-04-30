package com.zjt.mapper;

import com.zjt.entity.Tuser;
import com.zjt.util.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface TuserMapper extends MyMapper<Tuser> {
}