package com.bgs.examinationfront.service;


import com.bgs.examinationfront.pojo.User;

public interface LoginService {
    //查询电话号码是否存在
    User selectPhone(String phone);
}
