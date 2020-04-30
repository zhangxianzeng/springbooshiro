package com.zjt.mapper;

import com.zjt.entity.Tuserrole;
import com.zjt.util.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface TuserroleMapper extends MyMapper<Tuserrole> {
}