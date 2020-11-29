package com.justDoIt.core.dao;

import com.justDoIt.core.pojo.CourseSchedule;
import org.apache.ibatis.annotations.Param;

public interface CourseScheduleDao {
    CourseSchedule findCourseScheduleByTeacherId(@Param("teacher_id")int teacher_id);

    CourseSchedule findCourseScheduleByClassId(@Param("class_id")int class_id);

    void writeInSection(@Param("section")int section,
                        @Param("teacher_id")int teacher_id,
                        @Param("class_id")int class_id);

    void writeInRoom(@Param("room_id")int room_id,
                     @Param("teacher_id")int teacher_id,
                     @Param("class_id")int class_id,
                     @Param("course_id")int course_id);

    void writeInWeekday(@Param("weekday")int weekday,
                        @Param("teacher_id")int teacher_id,
                        @Param("class_id")int class_id);
}
