package com.bgs.examinationfront.service.serviceImp;

import com.bgs.examinationfront.mapper.UserMapper;
import com.bgs.examinationfront.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class UserServiceImp implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<Map<String, Object>> jurisdiction() {
        return userMapper.jurisdiction();
    }
}
