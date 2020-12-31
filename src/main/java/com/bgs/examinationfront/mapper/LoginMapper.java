package com.bgs.examinationfront.mapper;

import org.springframework.stereotype.Repository;

@Repository
public interface LoginMapper {

    //查询电话号码是否存在
    boolean selectPhone(String phone);
}
