package com.justDolt.core.service.impl;

import com.justDoIt.core.service.ArrangeCourseService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
@Transactional(transactionManager = "transactionManager")
public class TestArrangeCourseServiceImpl {
    @Resource(name = "arrangeCourseService")
    private ArrangeCourseService arrangeCourseService;

    @Test
    public void testArrangeCourses(){
        arrangeCourseService.arrangeCourses();
    }
}
