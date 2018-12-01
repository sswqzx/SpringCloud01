package com.springcloud.service;

import com.springcloud.mapper.UserMapper;
import com.springcloud.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ Author     ：ShaoWei Sun.
 * @ Date       ：Created in 11:46 2018/11/30
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User queryById(Long id){
        return userMapper.selectByPrimaryKey(id);
    }
}
