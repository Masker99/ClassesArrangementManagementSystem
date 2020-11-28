package com.justDoIt.core.dao;

import com.justDoIt.core.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

public interface TeacherDao {

    Teacher findTeacher(@Param("id") int id,
                        @Param("password") String password);

}
