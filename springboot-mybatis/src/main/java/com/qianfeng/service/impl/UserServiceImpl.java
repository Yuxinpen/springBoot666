package com.qianfeng.service.impl;

import com.qianfeng.entity.TUser;
import com.qianfeng.mapper.TUserMapper;
import com.qianfeng.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private TUserMapper userMapper;

    @Override
    public TUser getById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
