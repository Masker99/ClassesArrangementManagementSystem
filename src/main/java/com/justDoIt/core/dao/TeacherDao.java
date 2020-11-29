package com.justDoIt.core.dao;

import com.justDoIt.core.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

public interface TeacherDao {
    Teacher findTeacherById(@Param("id") int id);
}
