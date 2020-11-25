package com.justDolt.service;


import com.justDoIt.core.pojo.User;
import com.justDoIt.core.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@Transactional(transactionManager = "transactionManager")
public class TestUserServiceImpl {
    @Resource(name = "userService")
    private UserService userService;

    @Test
    public void testFindUser(){
        User user = userService.findUser(123456,"123456");
        System.out.println(user.toString());
    }
}
