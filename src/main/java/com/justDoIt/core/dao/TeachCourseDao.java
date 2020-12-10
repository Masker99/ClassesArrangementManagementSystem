package com.justDoIt.core.dao;

import com.justDoIt.core.pojo.TeachCourse;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeachCourseDao {
    List<TeachCourse> findTeachCourseById(@Param("teacher_id")int teacher_id);
    List<TeachCourse> findAllTeachCourse(@Param("school_year")String school_year,@Param("semester") int semester);
}
