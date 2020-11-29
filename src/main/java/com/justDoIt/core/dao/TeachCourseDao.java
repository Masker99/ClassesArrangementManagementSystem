package com.justDoIt.core.dao;

import com.justDoIt.core.pojo.TeachCourse;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeachCourseDao {
    List<TeachCourse> findTeachCourseById(@Param("teacher_id")int teacher_id);

    void signArranged(@Param("teacher_id")int teacher_id,
                      @Param("course_id")int course_id,
                      @Param("class_id")int class_id,
                      @Param("arranged")int arranged);
}
