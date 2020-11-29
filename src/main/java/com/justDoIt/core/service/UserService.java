package com.justDoIt.core.service;

import com.justDoIt.core.pojo.User;

public interface UserService {
    User findUser(int id,String password);
}
