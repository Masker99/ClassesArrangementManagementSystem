package com.justDoIt.core.dao;

import com.justDoIt.core.pojo.Course;
import org.apache.ibatis.annotations.Param;

public interface CourseDao {
    Course findCourseById(@Param("id")int id);
}
