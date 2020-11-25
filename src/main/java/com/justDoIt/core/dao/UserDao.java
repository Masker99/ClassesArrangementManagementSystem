package com.justDoIt.core.dao;

import com.justDoIt.core.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
    User findUser(@Param("id") int id,
                  @Param("password") String password);
}
