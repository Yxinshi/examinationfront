package com.bgs.examinationfront.service.serviceImp;

import com.bgs.examinationfront.mapper.LoginMapper;
import com.bgs.examinationfront.pojo.User;
import com.bgs.examinationfront.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImp implements LoginService {

    @Autowired
   private LoginMapper loginMapper;

    //查询电话号码是否存在
    @Override
    public User selectPhone(String phone) {
        User selectPhone = loginMapper.selectPhone(phone);
        return selectPhone;
    }
}
