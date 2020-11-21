package com.justDoIt.core.service.impl;

import com.justDoIt.core.dao.UserDao;
import com.justDoIt.core.pojo.User;
import com.justDoIt.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User findUser(int id,String password){
        User user = userDao.findUser(id,password);

        return user;
    }
}
