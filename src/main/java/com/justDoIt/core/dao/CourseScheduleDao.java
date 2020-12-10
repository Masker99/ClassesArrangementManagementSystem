package com.justDoIt.core.dao;

import com.justDoIt.core.pojo.CourseSchedule;
import org.apache.ibatis.annotations.Param;

public interface CourseScheduleDao {
    CourseSchedule findCourseScheduleByTeacherId(@Param("teacher_id")int teacher_id,
                                                 @Param("school_year")String school_year,
                                                 @Param("semester")int semester);

    CourseSchedule findCourseScheduleByClassId(@Param("class_id")int class_id);

    CourseSchedule findCourseScheduleByAllId(@Param("teacher_id")int teacher_id,
                                      @Param("class_id")int class_id,
                                      @Param("course_id")int course_id);

    CourseSchedule isConflictForTeacher(@Param("teacher_id")int teacher_id,
                                 @Param("weekday")int weekday,
                                 @Param("session")int session,
                                 @Param("school_year")String school_year,
                                 @Param("semester")int semester);

    CourseSchedule isConflictForClass(@Param("class_id")int class_id,
                               @Param("weekday")int weekday,
                               @Param("session")int session);

    CourseSchedule isConflictForRoom(@Param("room_id")String room_id,
                              @Param("weekday")int weekday,
                              @Param("session")int session,
                              @Param("school_year")String school_year,
                              @Param("semester")int semester);

    void writeInSection(@Param("section")int section,
                        @Param("teacher_id")int teacher_id,
                        @Param("class_id")int class_id,
                        @Param("course_id")int course_id);

    void writeInRoom(@Param("room_id")String room_id,
                     @Param("teacher_id")int teacher_id,
                     @Param("class_id")int class_id,
                     @Param("course_id")int course_id);

    void writeInWeekday(@Param("weekday")int weekday,
                        @Param("teacher_id")int teacher_id,
                        @Param("class_id")int class_id,
                        @Param("course_id")int course_id);

    void writeInCourseSchedule(@Param("courseSchedule")CourseSchedule courseSchedule);
}
