package com.bgs.examinationfront.mapper;

import com.bgs.examinationfront.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginMapper {

    //查询电话号码是否存在
    User selectPhone(String phone);
}
