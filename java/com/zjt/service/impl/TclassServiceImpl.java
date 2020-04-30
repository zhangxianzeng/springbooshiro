package com.zjt.service.impl;

import com.zjt.entity.Tclass;
import com.zjt.entity.Trole;
import com.zjt.mapper.TclassMapper;
import com.zjt.mapper.TroleMapper;
import com.zjt.service.TclassService;
import com.zjt.service.TroleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author <a href=""mailto:zhaojt@gtmap.cn></a>
 * @version 1.0, 2017/11/10
 * @description
 */

@Service("tclassService")
public class TclassServiceImpl extends BaseService<Tclass> implements TclassService {
    @Autowired
    private TclassMapper tclassMapper;

    @Override
    public List<Tclass> selectclass() {
        return tclassMapper.selectclass();
    }



}
