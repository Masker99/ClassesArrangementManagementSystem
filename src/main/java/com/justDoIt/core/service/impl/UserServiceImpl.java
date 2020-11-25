package com.justDoIt.core.service.impl;

import com.justDoIt.core.dao.UserDao;
import com.justDoIt.core.pojo.User;
import com.justDoIt.core.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
    @Resource(name = "userDao")
    private UserDao userDao;

    @Override
    public User findUser(int id,String password){
        return userDao.findUser(id,password);
    }
}
