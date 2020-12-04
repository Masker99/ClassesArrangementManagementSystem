package com.justDoIt.core.dao;

import com.justDoIt.core.pojo.Classroom;

import java.util.List;

public interface ClassroomDao {
    List<Classroom> findAllClassroom();
}
