package com.zjt.service;

import com.zjt.entity.Tclass;
import com.zjt.entity.Trole;

import java.util.List;

public interface TclassService extends IService<Tclass>{


    //↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
    List<Tclass> selectclass();//根据userid查询所有的角色

}