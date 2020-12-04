package com.justDoIt.core.service;

import com.justDoIt.core.pojo.Class;
import com.justDoIt.core.pojo.Classroom;
import com.justDoIt.core.pojo.CourseSchedule;
import com.justDoIt.core.pojo.TeachCourse;

import java.util.List;

public interface ArrangeCourseService {
    boolean arrangeCourses();
    List<TeachCourse> readTeacherCourse();
    boolean hadArranged(CourseSchedule courseSchedule);
    boolean isConflict(CourseSchedule courseSchedule);
    CourseSchedule dealConflict(CourseSchedule courseSchedule);
    List<Classroom> readClassroom();
    void writeInCourseSchedule(List<CourseSchedule> courseScheduleList);
}
